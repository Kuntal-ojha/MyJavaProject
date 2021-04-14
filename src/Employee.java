import java.io.*;
class Employee{
    double basic,da,hra;
    String Emp_name,Emp_code,Address,Ph_no;
    void entry()
    {
        try{
            String s;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Give the employee name: ");
            Emp_name=br.readLine();
            System.out.println("Give the employee code: ");
            Emp_code=br.readLine();
            System.out.println("Give the employee address: ");
            Address=br.readLine();
            System.out.println("Give the employee ph no: ");
            Ph_no=br.readLine();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void show(){
        System.out.println("Employee name :"+Emp_name);
        System.out.println("Employee code :"+Emp_code);
        System.out.println("Employee address :"+Address);
        System.out.println("Employee ph no :"+Ph_no);
        System.out.println("Employee basic :"+basic);
        System.out.println("Employee name :"+da);
        System.out.println("Employee hra: "+hra);

    }
}
class Manager extends Employee{
    void entM()
    {
        try{
            entry();
            String s;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Give the manager basic: ");
            s=br.readLine();
            basic=Double.parseDouble(s);
            da=basic*0.1;
            hra=basic*0.2;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}

class Typist extends Employee{
    void entT()
    {
        try{
            entry();
            String s;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Give the Typist basic: ");
            s=br.readLine();
            basic=Double.parseDouble(s);
            da=basic*0.1;
            hra=basic*0.2;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
class Officer extends Employee{
    void entO()
    {
        try{
            entry();
            String s;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Give the officer basic: ");
            s=br.readLine();
            basic=Double.parseDouble(s);
            da=basic*0.3;
            hra=basic*0.2;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
class Main {
    public static void main(String aarg[])
    {
        try
        {
            int i,num=0;
            String s;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Give the no. of manager:\n");
            s=br.readLine();
            num=Integer.parseInt(s);
            Manager[] man=new Manager[num];
            for(i=0;i<num;i++)
            {
                man[i]=new Manager();
                man[i].entM();
            }
            System.out.println("Give the no. of Typist :");
            s=br.readLine();
            num=Integer.parseInt(s);
            Typist[] typ=new Typist[num];
            for(i=0;i<num;i++)
            {
                typ[i]=new Typist();
                typ[i].entT();
            }
            System.out.println("Give the no. of Officer:\n");
            s=br.readLine();
            num=Integer.parseInt(s);
            Officer[] off=new Officer[num];
            for(i=0;i<num;i++)
            {
                off[i]=new Officer();
                off[i].entO();
            }

            System.out.println("Manager details\n");
            for(i=0;i<num;i++)
            {
                man[i].show();
            }
            System.out.println("Typist Details\n");
            for(i=0;i<num;i++)
            {
                typ[i].show();
            }
            System.out.println("officer Details\n");
            for(i=0;i<num;i++)
            {
                off[i].show();
            }


        }
        catch(Exception e){

        }

    }
}