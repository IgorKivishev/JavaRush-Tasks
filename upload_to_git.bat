@echo off
chcp 65001
cd /d C:\Users\dxarm\javarush\3537657\javarush-project
git pull origin main --allow-unrelated-histories
git add .
git commit -m "Решение задачи: %date%"
git push origin main
pause
