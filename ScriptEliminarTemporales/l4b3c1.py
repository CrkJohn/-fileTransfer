import os,shutil

folder = 'C:\\Temp'
for the_file in os.listdir(folder):
    file_path = os.path.join(folder, the_file)
    try:
        if ("l4b3c1" in file_path):
            continue
        if os.path.isfile(file_path) :
            print(file_path)
            os.unlink(file_path)
        elif os.path.isdir(file_path):
            shutil.rmtree(file_path)
    except Exception as e:
        print(e)
    print("Jajajajjaja")
