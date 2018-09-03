mkdir temp
cd temp
mkdir files
xcopy /r /d /i /s /y /exclude:.cuppyignore "Files" "temp\files"
7za.exe -tzip a files.zip "temp\files\"

