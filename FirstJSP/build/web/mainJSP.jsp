<%-- 
    Document   : index
    Created on : 04-Aug-2019, 21:25:35
    Author     : kuuku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    
    <%
        Date date = new Date();
        %>
    
    
    <body>
        
        <style>
       
            
            body {
    margin: 0;
    padding: 0;
    background: yellow;
    
}

.scene {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
    width: 400px;
    height: 400px;
    background: #3b93ff;
    border: 20px solid #fff;
    border-radius: 50%;
    overflow: hidden;
    box-shadow: inset 0 0 100px rgba(0,0,0,.5);
    animation: animateScene 5s linear infinite;
    animation-delay: 2s;
    
}

.scene:before {
    content: '';
    position: absolute;
    top: 0;
    left: 50%;
    width: 100%;
    height: 100%;
    background: rgba(0,0,0,.3);
    z-index: 1;
    animation-delay: 2s;
}

.fa-rocket {
    position: absolute;
    top: 50%;
    left:49.3%;
    transform: translate(-50%,-50%) rotate(-45deg);
    color: #fff;
    font-size: 10em !important;
    animation: animateRocket .2s linear infinite;
    animation-delay: 5s;
    animation-play-state: paused;
    text-shadow: -10px 15px 10px rgba(0,0,0,.2);
}


.cloud {
    position: absolute;
    color: #ccc;
    animation: animateCloud 1s linear infinite;
}

.cloud1 {
   left: 10%;
   font-size: 6em;
}

.cloud2 {
   left: 45%;
   font-size: 3em;
   z-index: -1;
   animation-delay: -0.8;
}

.cloud3 {
   right: 20%;
   font-size: 5em;
   animation-delay: -0.4;
}



@keyframes animateRocket {
    
    0% {
        transform: translate(-50%,-50%) rotate(-45deg) translate(0,0);
    }
    
    50% {
        transform: translate(-50%,-50%) rotate(-45deg) translate(-5px,5px);
    }
    
    100% {
        transform: translate(-50%,-50%) rotate(-45deg) translate(0,0);
    }
}
    
@keyframes animateCloud {
        
        0% {
            transform: translateY(-100%);
        }
        
        100% {
            transform: translateY(1000%);
        }
    }
    
@keyframes animateScene {
        
        0% {
            background: #b339ff;
            
        }
        
        30% {
            background: #3b93ff;
            
        }
        
         70% {
            background: #3b93ff;
            
         }
        
        100% {
            background: #b339ff;
            
        }
        
    }
    
    @keyframes example {
  0%   {background-color:red; left:0px; top:0px;}
  25%  {background-color:yellow; left:200px; top:0px;}
  50%  {background-color:blue; left:200px; top:200px;}
  75%  {background-color:green; left:0px; top:200px;}
  100% {background-color:red; left:0px; top:0px;}
}
 

            
            
            
        </style>    
        
        
        <div class="scene">
            <i class="fa fa-rocket" aria-hidden="true"></i>
            <span class="cloud cloud1"><i class="fa fa-cloud" aria-hidden="true"></i></span>
            <span class="cloud cloud2"><i class="fa fa-cloud" aria-hidden="true"></i></span>
            <span class="cloud cloud3"><i class="fa fa-cloud" aria-hidden="true"></i></span>
          </div>
        
        
        <p> Kuuku website Date is <%= date %> </p>
        
      
    </body>
</html>
         
  