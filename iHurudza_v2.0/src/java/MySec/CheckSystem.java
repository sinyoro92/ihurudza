/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySec;

import Methods.NewRegistration;
import MyValues.Louisa;
import MyValues.Values;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author devops20
 */
public class CheckSystem {
   
    
        public Connection myconn;
    
    Louisa loui = new Louisa();
    MySecCheck msc = new MySecCheck();
    Values vl = new Values();
    NewRegistration nw = new NewRegistration();
    private String sID ;
    private String susrID ;
    private String spasID ;
    private String myError;
    private String mySuccess;
    
    public CheckSystem()
    {
        this.sID = loui.sysID();
        this.susrID = loui.userSetName();
        this.spasID = loui.syspass();
        }
    /* copy the code to the Register class and verify the random generated code.
    the move all security setters and getter here for system id,pss,username.
    */    
        public boolean secCheck() throws SQLException 
    {
        
        if(msc.validateSysID(sID))
        {
            this.myError = vl.getSresponse();
        } 
        else if(msc.validateSysPass(spasID))
            {
                this.myError =    vl.getSresponseuser();
            }
        else if(msc.validateSysPass(spasID))
                {
                   this.myError = vl.getSresponsepass();
                }
        else
                {
            this.mySuccess = vl.getServerResponseState();
                }
            return true;
        }
        
}
