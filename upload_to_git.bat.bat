@echo off
cd /d C:\Users\dxarm\javarush\3537657\javarush-project
if "%cd%"=="C:\Users\dxarm\javarush\3537657\javarush-project" (
    echo Directory successfully changed.
) else (
    echo Failed to change directory.
    pause
    exit /b
)
"C:\Program Files\Git\bin\git.exe" pull origin main --allow-unrelated-histories
"C:\Program Files\Git\bin\git.exe" add .
"C:\Program Files\Git\bin\git.exe" commit -m "Task solution: %date%"
"C:\Program Files\Git\bin\git.exe" push origin main
pause
