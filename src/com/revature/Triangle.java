package com.revature;

class Triangle{
    public int base;
    public int height;
    public double area = 0;
    
    public Triangle(int pBase, int pHeight){
        this.base = pBase; this.height = pHeight;
        updateArea();
    }
    public void updateArea(){
        double a = base*height/2;
        area = a;
        System.out.println("result:"+a);
    }
    public void setBase(int b){ base  = b; updateArea(); }
    public void setHeight(int h){ height  = h; updateArea(); }

     public static void main(String[] args) {
		new Triangle(2,4);
		
	}




}


	
