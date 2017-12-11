<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<?php
		class cont{
			protected $id;
			protected $sold;
			protected $nume;
			public $com;
			public $value;
			

			public function getInfo($value){
			$nr=$value;
			switch ($nr){
				case "1":
					$this->getId();
				case "2":
					$this->getNume();
					$this->getSold();
					break;
				default:
					echo "Neautorizat";
					break;
				}
			}

			private function setSold($value){
				if ($value>0){
					$this->sold=$value;
				}else{
					echo "Suma invalida";
				}
			}

			public function Depozitare_Numerar($value){
				if ($value>=0){
					$this->setSold($this->sold+$value);
					$this->getInfo(2);
				}else{
					echo "Suma invalida";
				}
			}

			public function Extragere_Sold($value){
				if ($this->sold-$value<0){
					echo "Insuficiente fonduri";
				}else{
					$this->setSold($this->sold-$value);
					$this->getInfo(2);
				}
			}

			public function getId(){
				echo "Contul introdus are id-ul: ".$this->id."<br>";
			}
			public function getNume(){
				echo "Detinatorul contului se numeste: ".$this->nume."<br>";
			}
			public function getSold(){
				echo "Si are suma de: ".$this->sold." in cont.<br>";
			}

			public function __construct($id,$sold,$nume){
				$this->id=$id;
				$this->sold=$sold;
				$this->nume=$nume;
			}

			public function control($command,$value){
				switch($this->com){
					case "1":
						$this->getInfo($value);
						break;
					case "2":
						$this->Depozitare_Numerar($value);
						break;
					case "3":
						$this->Extragere_Sold($value);
						break;
					default :
						echo "Comanda invalida.";
						break;

				}

			}
			public function GetCommand($command,$value){
				$this->com=$command;
				$this->value=$value;
				$this->control($command,$value);
			}
		}
		$value=$_POST["Value"];
		$com=$_POST["Command"]; 	
		$a=new cont(1,5000,"Pop Ion");
		$a->GetCommand($com,$value);
	?>
</body>
</html>