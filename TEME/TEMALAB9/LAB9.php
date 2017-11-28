<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<?php
	$var1 = 5;
	$var2 = 6;
	$var3 = 2;
	echo "EX 1 : Scrieti un program care, dat fiind trei numere, sa le adune si a
afiseze rezultatul.<br>	";
	echo "Suma celor 3 numere: ".$var1." ".$var2." ".$var3." este = ".($var1+$var2+$var3)."<br><br>";

	$var4 = 7;
	echo "EX 2 : Scrieti un program care, dat fiind un numar intre 1 si 10 si apoi
sa afiseze toate numerele de la 1 la acel numar (folositi for sau
while).<br>";
	echo "Numerele de la 1 la ".$var4." sunt urmatoarele : ";
	for($i=1;$i<=$var4;$i++){
		echo $i." ";
	}

	echo "<br><br>EX 3 : Scrieti un program care, dat fiind anul in care v-ati nascut, sa
calculeze varsta si sa o afiseze.<br>";
	
	$var5= 1996;
	echo "Aveti ".(date("Y")-$var5)." de ani.<br><br>";

	echo "EX 4 : Scrieti un program care, dat fiind luna in care v-ati nascut sa
afiseze ceva interesant despre luna respectiva (folositi switch).<br>";
	$var6= 3;
	switch($var6){
		case "1": echo "Iarna si frig";
			break;
		case "2": echo "Aproape primavara dar tot frig";
			break;
		case "3": echo "Primavara si ghiocei";
			break;
		case "4": echo "Primavara si 1 Aprilie";
			break;
		case "5": echo "Aproape vara si 1 Mai";
			break;
		case "6": echo "Vara dar lumea inca merge la scoala";
			break;
		case "7": echo "Vara si nu mai merge lumea la scoala";
			break;
		case "8": echo "Prea cald";
			break;
		case "9": echo "Toti elevii plang";
			break;
		case "10": echo "Toti studentii plang";
			break;
		case "11": echo "Cautam schiurile prin pod ";
			break;
		default : echo "Ai economisit din Ianuarie ca sa cumperi cadouri";
			break;
	}

	echo "<br><br>EX 5 :Scrieti un program care, dat fiind o luna a anului sa afiseze cate
zile are luna aceea (folositi switch).";
	$var7 = array(31 ,29 ,31 ,30 ,31 ,30 ,31 ,31 ,30 ,31 ,30 ,31);
	$var8 = 3;
	echo "<br>Luna a ".$var8."-a are : ";
	switch($var6){
		case "1": echo $var7[0];
			break;
		case "2": echo $var7[1];
			break;
		case "3": echo $var7[2];
			break;
		case "4": echo $var7[3];
			break;
		case "5": echo $var7[4];
			break;
		case "6": echo $var7[5];
			break;
		case "7": echo $var7[6];
			break;
		case "8": echo $var7[7];
			break;
		case "9": echo $var7[8];
			break;
		case "10": echo $var7[9];
			break;
		case "11": echo $var7[10];
			break;
		default : echo $var7[11];;
			break;
	}
	echo " de zile.";

?>
</body>
</html>