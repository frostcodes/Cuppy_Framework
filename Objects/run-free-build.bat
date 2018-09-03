rmdir "Objects\temp\Files" /s /Q
rmdir "Objects\temp\Output\Free" /s /Q

mkdir temp
cd temp
mkdir Files
mkdir Output
cd Output
mkdir Free
cd ../../../
xcopy /r /d /i /s /y /exclude:.cuppyignore "Files" "Objects\temp\Files"
7za.exe -tzip a "Objects\temp\Output\Free\CFResources.jar" ".\Objects\temp\Files\"

rmdir "Objects\temp\Files" /s /Q