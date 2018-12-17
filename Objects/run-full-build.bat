rmdir "Objects\temp\Files" /s /Q
rmdir "Objects\temp\Output\Full" /s /Q

mkdir temp
cd temp
mkdir Files
mkdir Output
cd Output
mkdir Full
cd ../../../
xcopy /r /d /i /s /y "Files" "Objects\temp\Files"
7za.exe -tzip a "Objects\temp\Output\Full\CFResources.jar" ".\Objects\temp\Files\"

rmdir "Objects\temp\Files" /s /Q