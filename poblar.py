from sys import stdin


def main():
    for i in range(200,216):
        print("INSERT INTO Computadores(id,nombre,id_salon) VALUES (%d,'%s',3);"%(i,"Sistemas"+str(i)))
main()
