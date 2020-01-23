const fs = require('fs')
const prg1 = async (path) => {
    try{
        console.log("-----------------------")
        const dir= fs.promises.readdir(path, (err, contents) => {
            // if (err) {
            //     return
            // }
            let i=0;
            contents.forEach((element) => {
                if(i<5)
                {
                    console.log("->" + element)
                    //async () => {   
                }
                else
                {
                    console.log("More than 4-----------------------")
                    return
                }
                i++;
                if(fs.Dirent.prototype.isDirectory(path + "\\" + element))
                console.log("=-==-=-=-=-=-=-=-=-=")
                 prg1(path + "\\" + element)
                 //}
            });
            console.log("_____________________________")
        })
    }
    catch (e) {
        console.log("_____________________________================")
    }
    //const c1=await printContents(path)



    
}
prg1("D:\\Magoosh GRE\\03 Verbal");
//1.print 10 contents in the directory and if there are more print "others".
//2.if there is a sub directory repeat 1.
//follow indentation (dirLev1->file1
//                             file2...
//                            dirLev2->file3
//                                     file4...
//                                     deiLev3->...     ).
//pass the directory using command line arguments.
/*var promiseCount = 0;
let fs = require('fs');
let path = "D:\\cse3-1";
function readDir(path) {
    try {
        fs.readdir(path, (err, info) => {
            if(info === undefined){
                return;
            }
            if (err){
                  return;
            }
              
            info.map((i) => {
                console.log(i);
                fs.readdir((path + "\\" + i), (err, info) => {
                    if (info === undefined)
                        return;
                    info.map((i) => {
                        if (err)
                            return;
                        console.log("   " + i);
                        fs.readdir((path + "\\" + i), (err, info) => {
                            if (info === undefined)
                                return;
                            info.map((i) => {
                                if (err)
                                    return;
                                console.log("   " + i);

                            })
                        })
                    })
                    // fs.readdir(path+"\\"+)
                })
            })
        })
    }
    catch (e) {
        console.log(" ");
    }
}
readDir(path);*/