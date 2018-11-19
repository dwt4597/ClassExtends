package com.biz.classex.parents;

import com.biz.classex.children.CatClass;
import com.biz.classex.children.DogClass;

public class ClassExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogClass dog = new DogClass();
		CatClass cat = new CatClass();
				
		AnimalClass animalClass = new AnimalClass();
		animalClass.strName = "포유류 동물";
		animalClass.whatIsName();
		
		dog.strName = "몽탱이";
		dog.whatIsName();
		
		dog.strColor = "화이트";
		dog.whatIscolor();
		
		cat.strName = "나비";
		cat.whatIsName();

		
	}

}
