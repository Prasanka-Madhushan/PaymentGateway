<%-- 
    Document   : index
    Created on : Nov 11, 2022, 8:16:10 PM
    Author     : Prasanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Services</title>
        
        <%-- style sheet link --%>
        <link href="style.css" rel="stylesheet" type="text/css">
        
    </head>
    
    <body>
        <div class="container">
            <form action="PaymentServices" method="POST">
                
                <div class="row">
                    <div class="column">
                        
                        <h2 class="heading">Billing Details</h2>
                        
                        <div class="inptbox">
                            <span>Name : </span>
                            <input type="text" name="uname" placeholder="Alex" required>
                        </div>
                        
                        <div class="inptbox">
                            <span>Phone No : </span>
                            <input type="text" name="tp" placeholder="+94 xxxxxxxxx">
                        </div>
                        
                        <div class="inptbox">
                            <span>Email : </span>
                            <input type="text" name="email" placeholder="ABC@gmail.com" required>
                        </div>
                        
                        <div class="inptbox">
                            <span>Address : </span>
                            <input type="text" name="address" placeholder="SriLanka, Colombo 07" required>
                        </div>
                        
                        <div class="inptbox">
                            <span>City : </span>
                            <input type="text" name="city" placeholder="Colombo">
                        </div>
                        
                        <div class="flex">
                            <div class="inptbox">
                                <span>State : </span>
                                <input type="text" name="state" placeholder="Sri Lanka">
                            </div>
                            
                            <div class="inptbox">
                                <span>ZIP Code : </span>
                                <input type="text" name="zipcode" placeholder="xxxx">
                            </div>       
                        </div>
                        
                    </div>
                    
                    <div class="column">
                        <h2 class="heading">Payment Details</h2>
                        
                        <div class="inptbox">
                            <span>Payment Methods : </span>
                            <img src="images/paypal img.jpg" alt="Payment Methods"/>
                        </div>
                        
                        <div class="inptbox">
                            <span>Card Holder's Name : </span>
                            <input type="text" name="holdername" placeholder="Mr.Alex" required>
                        </div>
                        
                        <div class="inptbox">
                            <span>Card Number : </span>
                            <input type="text" name="cardno" placeholder="1111-2222-3333-4444" required>
                        </div>
                        
                        <div class="inptbox">
                            <span>Card EXP Month : </span>
                            <input type="text" name="expmonth" placeholder="xx" required>
                        </div>
                      
                        
                        <div class="flex">
                            
                            <div class="inptbox">
                                <span>EXP Year : </span>
                                <input type="text" name="expyr" placeholder="20xx" required>
                            </div> 
                            
                            <div class="inptbox">
                                <span>CVV : </span>
                                <input type="text" name="cvvno" placeholder="xxxx" required>
                            </div>      
                        </div>
                        
                        
                    </div>
                          
                </div>
                
                <input type="submit" value="Check Out" class="submitbtn">
                
            </form>
        </div>
    </body>
</html>
