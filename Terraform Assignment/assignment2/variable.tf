# Define variables variable "environment" {  description = "env: production or development" }
 variable "image_name" {      
     default = "ghost:latest"
          }

 variable "container_name" {  
       default = "ghost_blog"
            }

 variable "internal_port" {  
     default = "2368" 
     }

 variable "external_port" {   
     default = 8080
        }