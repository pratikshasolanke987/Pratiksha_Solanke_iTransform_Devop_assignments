terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "2.12.2"
    }
  }
}
provider "docker" {
  host    = "npipe:////.//pipe//docker_engine"
}



# Download the latest Ghost Image
resource "docker_image" "image_id" {
 name = var.image_name[var.env]
}

# Start the Container
resource "docker_container" "container_id" {
  name  = var.container_name[var.env]
  image = docker_image.image_id.latest
  ports {
    internal = 2368
    external = var.ext_port[var.env]
  }
}
