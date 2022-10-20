1. Создать главный класс с методом main - Colors

2. создать 1й новый класс Black
	- в нем 3 поля 	BB1, BB2, BB3
	- метод blackVolume()	void
	- метод blackSquare		return

5. создать 2й новый класс Red
	- в нем 3 поля 	RR1, RR2, RR3
	- метод redMove()	void
	- метод redJump()	return

5. создать 3й новый класс Yellow
	- в нем 3 поля 	YY1, YY2, YY3
	- метод yellowFall()	void
	- метод yellowStep()	return

 
3. вызвать Black.blackVolume() (через Colors.main())
4. вызвать Black.blackSquare() из Black.blackVolume (через BlackDemo.main())
5. вызвать Red.redMove() из Black.blackVolume()
6. вызвать Yellow.yellowFall из Red.redJump() из Black.blackSquare()

	