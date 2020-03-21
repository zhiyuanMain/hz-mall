# 模版分支 master
# 开发分支 develop

# git 提交三部曲

// 切换到develop分支
git checkout develop

// coding
// ...

// 将本地的修改暂存到缓存区
git add .
// 添加log
git commit -m "log"
// 推送到远程分支
git push origin HEAD


# 微信小程序本地预览效果
1. 下载[微信小程序开发者工具](https://developers.weixin.qq.com/miniprogram/dev/devtools/download.html)
2. 将文件夹wx-mall导入到工程中
3. 搜索关键字`tbc:`，配置开发ip地址