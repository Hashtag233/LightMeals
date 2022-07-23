'''
        标题：Minecraft模组物品模型和语言文件json文件自动生成工具
	
        使用方法：
        将源码复制，在【<模组工作区文件夹>/src/main/resources/assets/<modid>/】
        目录下创建一个文件名为【<自定义文件名>.py】的文件，将源码粘贴到文件中，双击即可运行。

        输入模组ID后按下回车；
        在每行中输入【物品中文名称】,【物品英文名称】后按下回车（可同时处理多行）；
        在不输入内容的情况下直接按下回车即可退出。
	
        依赖库：Python3.7或以上的原版即可，无需任何第三方库。
'''
import json

def appendLang(enus: str, zhcn: str, itemid: str):
    list_zh = []
    list_en = []
    fileen = open(".\\lang\\en_us.json", mode='r', encoding='utf-8')
    filezh = open(".\\lang\\zh_cn.json", mode='r', encoding='utf-8')
    linezh = filezh.readline()
    lineen = fileen.readline()
    while linezh:
        list_zh.append(linezh)
        linezh = filezh.readline()
    while lineen:
        list_en.append(lineen)
        lineen = fileen.readline()
    filezh.close()
    fileen.close()
    list_en.insert(1, '  "item.lightmeals.' + itemid + '": "' + enus + '",\n')
    list_zh.insert(1, '  "item.lightmeals.' + itemid + '": "' + zhcn + '",\n')
    line_zh = ""
    line_en = ""
    for i in list_zh:
        line_zh = line_zh + i
    for i in list_en:
        line_en = line_en + i
    with open('.\\lang\\en_us.json', 'w', encoding='utf-8') as file_en:
        file_en.write(line_en)
    with open('.\\lang\\zh_cn.json', 'w', encoding='utf-8') as file_zh:
        file_zh.write(line_zh)
    print("LANG FILE WRITE FINISHED")

def main():
    mod_id = input('INPUT MODID:\n')
    while True:
        _input = input('[PRESS ENTER TO EXIT] INPUT ZH_CN NAME,EN_US NAME:\n')
        if _input == '':
            break
        if _input.count(',') != 1:
            print('INPUT ERROR')
            continue
        zh_cn , en_us = _input.split(',')
        item_id = en_us.lower().replace(' ','_')
        model_file_obj = {"parent": "item/generated", "textures": {"layer0": mod_id +":item/" + item_id}}
        json.dump(model_file_obj, open('.\\models\\item\\' + item_id + '.json', 'w'), indent=4, sort_keys=True)
        print("MODEL FILE DUMP FINISHED")
        appendLang(en_us, zh_cn, item_id)

if __name__ == '__main__':
    main()
