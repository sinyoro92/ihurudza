/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyValues;

/**
 *
 * @author sinyoro
 */
public class Values {
    
    Nyasha ny =new Nyasha (); 
   
    private static String sme;
    private static String r1 ;
    private static String r2 ;
    private static String r3 ;
    private static String st1;
    private static String st2;
    private static String usn;
    private static String pass;
    private static String stat1;
    private static String stat2;
    private static String response;
    private static String sresponse;
    private static String sresponseuser;
    private static String sresponsepass;

    public String role1( String a)
    {
        this.r1 = a;
        return a;
    }
     public String role2( String b)
    {
        this.r2 = b;
        return b;
    }
      public String role3( String c)
    {
        this.r3 = c;
        return c;
    }
      public void setSessionName(String a)
      {
          this.sme = a;
      }
      public void setSresponse(String sres)
      {
          this.sresponse = sres;
      }
       public void setSresponseuser(String sresuser)
      {
          this.sresponseuser = sresuser;
      }
        public void setSresponsepass(String srespass)
      {
          this.sresponsepass = srespass;
      }
    public void setServerResponseState(String stresponse) 
    {
        this.response = stresponse;
    }
    
    
    
    
    
    
    
    
    
     public String getServerResponseState()
     {
         return this.response;
     }
      public String getSresponse()
      {
          return this.sresponse;
      }
      
      public String getSresponseuser()
      {
          return this.sresponseuser;
      }
      
      public String getSresponsepass()
      {
          return this.sresponsepass;
      }
      public String getSessionName()
      {
          return this.sme;
      }

      public String status1(String d)
    {
        this.st1 = d;
        return d;
    }
      public String status2(String e)
    {
        this.st2 = e;
        return e;
    }
      public String usrnmeNull(String f)
      {
          this.usn = f;
          return f;
      }
      public String passNull(String g)
      {
          this.pass = g;
          return g;
      }
      public String accState1(String h)
      {
          this.stat1=h;
          return h;
      }
      public String accState2(String i)
      {
          this.stat2 = i;
          return i;
      }
}



