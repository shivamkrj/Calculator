package com.example.shivamkumar.scalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    double n=0;
    double pre=0;
    int flagd=0;
    int flag=0;
    int operation=0;
    String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView1);
    }


    public void ac(View view){
        pre=0;flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
    }
    public void equal(View view){
        if(flag==4){

        }
        double d=Double.parseDouble(s);
        flagd=0;
        if(flag==0){
            pre=d;
            s="0";
            if(operation==1){
                pre+=d;
            }else if(operation==2){
                pre-=d;
            }else if(operation==3){
                pre*=d;
            }else if(operation==4){
                pre/=d;
            }
            setTforNum(pre,' ');
            flag=0;
        }
        else if(flag==1){

            if(operation==1){
                pre+=d;
            }else if(operation==2){
                pre-=d;
            }else if(operation==3){
                pre*=d;
            }else if(operation==4){
                pre/=d;
            }
            s="0";
            setTforNum(pre,' ');
            flag=0;
            operation=0;

        }else if(flag==2||flag==3){
            operation=0;setTforNum(pre,' ');
        }
        flag=4;
    }

    public void one(View view){
        if(flag==4){
            flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
        }
        else if(flag==2||flag==3)
            flag=1;
        if(s.equals("0"))
            s="";
        s=s+"1";
        print(s);
    }
    public void two(View view){
        if(flag==4){
            flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
        }
        if(flag==2||flag==3)
            flag=1;
        if(s.equals("0"))
            s="";
        s=s+"2";
        print(s);
    }
    public void three(View view){
        if(flag==4){
            flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
        }
        if(flag==2||flag==3)
            flag=1;
        if(s.equals("0"))
            s="";
        s=s+"3";
        print(s);
    }
    public void four(View view){
        if(flag==4){
            flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
        }
        if(flag==2||flag==3)
            flag=1;
        if(s.equals("0"))
            s="";
        s=s+"4";
        print(s);
    }
    public void five(View view){
        if(flag==4){
            flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
        }
        if(flag==2||flag==3)
            flag=1;
        if(s.equals("0"))
            s="";
        s=s+"5";
        print(s);
    }
    public void six(View view){
        if(flag==4){
            flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
        }
        if(flag==2||flag==3)
            flag=1;
        if(s.equals("0"))
            s="";
        s=s+"6";
        print(s);
    }
    public void seven(View view){
        if(flag==4){
            flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
        }
        if(flag==2||flag==3)
            flag=1;
        if(s.equals("0"))
            s="";
        s=s+"7";
        print(s);
    }
    public void eight(View view){
        if(flag==4){
            flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
        }
        if(flag==2||flag==3)
            flag=1;
        if(s.equals("0"))
            s="";
        s=s+"8";
        print(s);
    }
    public void nine(View view){
        if(flag==4){
            flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
        }
        if(flag==2||flag==3)
            flag=1;
        if(s.equals("0"))
            s="";
        s=s+"9";
        print(s);
    }
    public void zero(View view){
        if(flag==4){
            flag=0;flagd=0;operation=0;s="0";n=0;textView.setText("0");
        }
        if(flag==2||flag==3)
            flag=1;
        if(s.equals("0"))
            s="0";
        s=s+"0";
        print(s);
    }

    public void decimal(View view){
        if(flagd==1)
            return;
        flagd=1;
        s=s+".";
        print(s);
     //   textView.setText(convertDtI(n)+".");
    }

    public void print(String c){
        textView.setText(c);
    }

    public void add(View view){
        if(flag==4){
            operation=1;
            flag=3;
        }
        if(s==null||s.length()==0){
            Toast.makeText(this,"Enter any num to add",Toast.LENGTH_SHORT).show();
            return;
        }
        double d=Double.parseDouble(s);
        flagd=0;
        if(flag==0){
            pre=Double.parseDouble(s);
            textView.setText(s+" "+'+');
            s="0";
            operation=1;
            flag=3;
        }
        else if(flag==1){

            if(operation==1){
                pre+=d;

            }else if(operation==2){
                pre-=d;
            }else if(operation==3){
                pre*=d;
            }else if(operation==4){
                pre/=d;
            }
            s="0";
            setTforNum(pre,'+');
            flag=2;
            operation=1;
        }else if(flag==2||flag==3){
            operation=1;setTforNum(pre,'+');
        }

    }
    public void sub(View view){
        if(flag==4){
            operation=1;
            flag=3;
        }
        if(flag==0&&pre==0){
            s="-";
            return;
        }
        if(flag==2){

            flag=1;
        }
        if(s==null||s.length()==0){
            Toast.makeText(this,"Enter any num to subtract",Toast.LENGTH_SHORT).show();
            return;
        }
            double d=Double.parseDouble(s);
            if(flag==0){
                pre=Double.parseDouble(s);
                textView.setText(s+" "+'-');
                s="0";
                operation=2;
                flag=3;
            }
            else if(flag==1){

                if(operation==1){
                    pre+=d;

                }else if(operation==2){
                    pre-=d;
                }else if(operation==3){
                    pre*=d;
                }else if(operation==4){
                    pre/=d;
                }
                setTforNum(pre,'-');
                flag=2;
                operation=2;
                s="0";
            }else if(flag==2||flag==3){
                operation=2;

                setTforNum(pre,'-');
            }
    }
    public void mul(View view){
        if(flag==4){
            operation=1;
            flag=3;
        }
        if(s==null||s.length()==0){
            Toast.makeText(this,"Enter any num to multiply",Toast.LENGTH_SHORT).show();
            return;
        }
        double d=Double.parseDouble(s);
        flagd=0;
        if(flag==0){
            pre=Double.parseDouble(s);
            textView.setText(s+" "+'x');
            s="0";
            operation=3;
            flag=3;
        }
        else if(flag==1){

            if(operation==1){
                pre+=d;

            }else if(operation==2){
                pre-=d;
            }else if(operation==3){
                pre*=d;
            }else if(operation==4){
                pre/=d;
            }
            s="0";
            setTforNum(pre,'x');
            flag=2;
            operation=3;
        }else if(flag==2||flag==3){
            operation=3;setTforNum(pre,'x');
        }
    }
    public void div(View view){
        if(flag==4){
            operation=1;
            flag=3;
        }
        if(s==null||s.length()==0){
            Toast.makeText(this,"Enter any num to divide",Toast.LENGTH_SHORT).show();
            return;
        }
        double d=Double.parseDouble(s);
        flagd=0;
        if(flag==0){
            pre=Double.parseDouble(s);
            textView.setText(s+" "+'/');
            s="0";
            operation=4;
            flag=3;
        }
        else if(flag==1){

            if(operation==1){
                pre+=d;

            }else if(operation==2){
                pre-=d;
            }else if(operation==3){
                pre*=d;
            }else if(operation==4){
                pre/=d;
            }
            s="0";
            setTforNum(pre,'/');
            flag=2;
            operation=1;
        }else if(flag==2||flag==3){
            operation=4;setTforNum(pre,'/');
        }

    }



    public boolean checkFraction(double d){
        int i=(int)d;
        double a=(double)i;
        if(a==d)
            return false;
        else
            return true;
    }
    public int convertDtI(double d){
        int nn=(int)d;
        return nn;
    }
    public void setTforNum(double n,char c){

        if(checkFraction(n))
            textView.setText(""+n+" "+c);
        else
            textView.setText(""+convertDtI(n)+" "+c);
    }
    public int decimalPartLength(double d){
        if (d >= 1) { //we only need the fraction digits
            d = d - (long) d;
        }
        if (d == 0) { //nothing to count
            return 0;
        }
        d *= 10; //shifts 1 digit to left
        int count = 1;
        while (d - (long) d != 0) { //keeps shifting until there are no more fractions
            d *= 10;
            count++;
        }
        return count;
    }
}
