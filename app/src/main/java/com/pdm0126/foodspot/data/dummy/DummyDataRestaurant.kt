package com.pdm0126.foodspot.data.dummy

import com.pdm0126.foodspot.data.model.Menus
import com.pdm0126.foodspot.data.model.Restaurant

val sampleRestaurant = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Place",
        description = "Las mejores pizzas artesanales de la ciudad",
        imageUrl = "https://i.pinimg.com/736x/7c/c9/33/7cc9332219ddc7cb970ccafad1443305.jpg",
        categories = listOf("Italiana", "Pizzas"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Pizza Margarita",
                description = "Mozarella, albahaca y tomate fresco",
                imageUrl = "https://i.pinimg.com/736x/96/94/c8/9694c8624335217731e6c9e8ece72312.jpg"
            ),
            Menus(
                id =  2,
                name = "Pizza Pepperoni",
                description = "Pepperoni con queso mozzarella derretido",
                imageUrl = "https://i.pinimg.com/736x/3e/c9/fe/3ec9fe32c6217014789b5f42e2343f47.jpg"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "Pizza Boom",
        description = "Creando experiencias que despiertan tus sentidos",
        imageUrl = "https://scontent.fsal2-2.fna.fbcdn.net/v/t39.30808-6/485083045_1059883702851442_575144521288973301_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=cc71e4&_nc_ohc=ZfOYdOj7kvgQ7kNvwHFLaV6&_nc_oc=Adr6FaoR0yEZuC5xKALqlVgi6FOj5gQ8ph-IptiY3YwWgm5v51qmjFtaVwLbcIm8b3yQpiB8Dez2nQm0RmvkJ_nP&_nc_zt=23&_nc_ht=scontent.fsal2-2.fna&_nc_gid=cZlPtySEJMX-RxJZDh2cew&_nc_ss=7b289&oh=00_Af6UA37JqDB2JtWfCfiG8OmSqcEY0zFCdHnUjUGqsv89Dw&oe=6A0B3753",
        categories = listOf("Italiana", "Pizzas"),
        menu =  listOf(
            Menus(
                id = 1,
                name = "Pizza Hawaiana",
                description = "Jamón Virginia,piña y cebolla",
                imageUrl = "https://i.pinimg.com/1200x/9d/b7/50/9db750a4eafcf1d1fb551520018c8bf6.jpg"
            ),
            Menus (
                id = 2,
                name = "Boom 6",
                description = "Loroco y Queso",
                imageUrl = "https://i.pinimg.com/736x/56/ab/91/56ab91ea27e6d89b76e0d02b54be2abc.jpg"
            ),
            Menus(
                id = 3,
                name = "Pizza de Camarones",
                description = "Camarones y Queso",
                imageUrl = "https://i.pinimg.com/736x/76/4a/e3/764ae3bee75fa6080f8cd2610a3690c8.jpg"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Pizza Hut",
        description = "Nadie supera a The Hut en pizzas",
        imageUrl = "https://thumbs.dreamstime.com/b/pizza-hut-restaurant-exterior-visible-interior-dusk-balikpapan-indonesia-april-captured-featuring-illuminated-signage-455290721.jpg",
        categories = listOf("Italiana", "Pizzas"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Pizza Chipotle Boom",
                description = "Carne, Tocino Picado, Queso mozzarella, Salsa Alfredo ,Salsa chipotle",
                imageUrl = "https://www.pizzahut.com.sv/static/media/images/images/jpg/4550_1_08-11-2023-10-50.jpg"
            ),
            Menus(
                id = 2,
                name = "Pizza cuatro quesos ",
                description = "Mozzarella, Queso parmesano, Queso cheddar, Queso provolone",
                imageUrl = "https://www.pizzahut.com.sv/static/media/images/images/jpg/4820_1_03-01-2024-21-52.jpg"
            ),
            Menus(
                id = 3,
                name = "Pizza Buffalo Chicken",
                description = "Salsa Alfredo, Trozos de pollo, Aderezo ranch, Salsa buffalo, Cebolla mmorada, elotito y cilantro",
                imageUrl = "https://www.pizzahut.com.sv/static/media/images/images/jpg/1_13-06-2024-00-40_MD.jpg"
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "Papa Johns",
        description = "Mejores ingredientes. Mejor pizza. Papa John's",
        imageUrl = "https://www.lagranvia.com.sv/storage/shops/QlIXDruEaBp77DKN1Km1qSnwagg7kIcwUYHKvyMu.jpeg",
        categories = listOf("Italiana", "Pizzas"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Hawaiana Volcano",
                description = "Jalapeños, Piña, Jamón Canadiense, Tocino y Queso mozzarella",
                imageUrl = "https://pjsv-images.nyc3.digitaloceanspaces.com/common-files/product-163/0761-hawaiana-volcano-v2.jpg"
            ),
            Menus(
                id = 2,
                name = "Carnívora",
                description = "Pepperoni, Salchicha, Carne de res, Tocino ahumedo, Jamón y Queso mozzarella",
                imageUrl = "https://pjsv-images.nyc3.digitaloceanspaces.com/common-files/product-4/carnivora.jpg"
            ),
            Menus(
                id = 3,
                name = "Papadia",
                description = "Jamon y queso",
                imageUrl = "https://pjsv-images.nyc3.digitaloceanspaces.com/common-files/product-156/7020-product-papadia-pepp-sauge.jpg"
            )
        )
    ),
    Restaurant(
        id = 5,
        name = "Little Caesar",
        description = "¡Pizza! ¡Pizza!",
        imageUrl = "https://peruretail.sfo3.cdn.digitaloceanspaces.com/wp-content/uploads/little-caesars-3-per%C3%BA-retail.jpeg",
        categories = listOf("Italiana", "Pizza"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Ultimate Supreme",
                description = "Pepperoni, Salchicha Italiana, Champiñones, Cebolla y Chile Pimiento",
                imageUrl = "https://mobilestatic.littlecaesars.com/weborderingimages/11616129-ce29-450e-af39-8d543f05ab78.jpg"
            ),
            Menus(
                id = 2,
                name = "3 Meat Treat",
                description = "Pepperoni, Salchicha Italiana y Tocino",
                imageUrl = "https://mobilestatic.littlecaesars.com/weborderingimages/4fc71413-5a82-4626-bba9-041d8c22435d.jpg"
            ),
            Menus(
                id = 3,
                name = "Crazy Cheese Bread",
                description = "12 Palitos de pan cubiertos de 3 quesos: Parmesano, Muenster y Mozzarella",
                imageUrl = "https://inturfiles.s3.us-east-2.amazonaws.com/folder/products/500X500/CRAZY_CHEESE_BREAD_d43499d.jpg"
            )
        )
    ),
    Restaurant(
        id = 6,
        name = "Pollo Campero",
        description = "Vivir a Todo Sabor",
        imageUrl = "https://assets-bizneworleans-com.s3.amazonaws.com/2025/02/IMG_9262-1.jpeg",
        categories = listOf( "Pollo", "Ensaladas"),
        menu =  listOf(
            Menus(
                id = 1,
                name = "Menú súper campero",
                description = "3 piezas de pollo, 2 acompañamientos , 1 bebida, 1 pan o tortilla",
                imageUrl = "https://hermanrest.misganancias.net/assets/uploads/f8eb75ee2e474f119b9c9bbcd77a6738.png"
            ),
            Menus (
                id = 2,
                name = "Menú súper campero alitas",
                description = "9 alitas , 1 aderezo, 2 acompañamientos, 1 pan y 1 bebida",
                imageUrl = "https://hermanrest.misganancias.net/assets/uploads/2cf02403dbfeb6c204332a4132ca09dd.png"
            ),
            Menus(
                id = 3,
                name = "Tazón Campero",
                description = "Arroz con maiz y cilantro, frijoles charros, queso mozzarella, lechuga, pico de gallo, nachos en tiras, aguacate, cilantro, Pollo empanizado",
                imageUrl = "https://d1ralsognjng37.cloudfront.net/89707d09-0bb5-4d59-93fb-ad8ddd8896cf.jpeg"
            )
        )
    ),
    Restaurant(
        id = 7,
        name = "KOI",
        description = "Bebidas premium hechas con ingredientes de alta calidad, inspiradas en la cultura del té asiático",
        imageUrl = "https://media-cdn.tripadvisor.com/media/photo-s/06/67/b1/46/koi-sushi.jpg",
        categories = listOf("Bebidas", "Té", "Milk Tea", "Cafe"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Bubble Milk Tea",
                description = "Té negro con leche fresca y perlas de tapioca",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTLNnHIP85fimO_ijdNcxoX_yVHPkjh1Gk2hQ&s"
            ),
            Menus(
                id = 2 ,
                name = "Golden Bubble Milk",
                description = "Leche fresca con perlas doradas de tapioca y azúcar morena",
                imageUrl = "https://i.pinimg.com/474x/31/e8/31/31e8310ad1b832d545aee9dffa74d8cf.jpg"
            ),
            Menus(
                id = 3,
                name = "KOI thé",
                description = "Té autentico con el sabor característico de KOI0",
                imageUrl = "https://awards.brandingforum.org/wp-content/uploads/2025/12/D.jpg"
            )
        )
    ),
    Restaurant(
        id = 8,
        name = "Starbucks",
        description = "Café premium , bebidas frías y postres en un ambiente acogedor",
        imageUrl = "https://cdn.forbes.com.mx/2026/01/Starbucks-ventas.webp",
        categories = listOf("Café", "Bebidas", "Postres"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Caramel Frappuchino",
                description = "Bebida fría de café con caramelo, leche y crema batida",
                imageUrl = "https://images.unsplash.com/photo-1592321675774-3de57f3ee0dc?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Menus(
                id = 2,
                name = "Mocha Frappuccino",
                description = "Café mezclado con chocolate, hielo y crema batida",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEX-NAutxFgJfVtu8mQl8K6L7qqw7mx6sgWQ&s"
            ),
            Menus(
                id = 3,
                name = "Latte Vainilla",
                description = "Espresso suave con leche vaporizada y vainilla",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbCgNBlmKlnK0i_TY76uy9d6M78VAUrsS5tw&s"
            )
        )
    ),
    Restaurant(
        id = 9,
        name = "Burger King",
        description = "Hamburguesas a la parrilla con ingredientes frescos y sabor auténtico",
        imageUrl = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0e/01/8d/17/good-service-for-a-change.jpg?w=900&h=-1&s=1",
        categories = listOf("Hamburguesas", "Comida Rápida", "Bebidas"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Whopper",
                description = "Hamburguesas con carne a la parrilla, tomate,  lechuga, cebolla y pepinillos",
                imageUrl = "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_WHOPPER_500X540px.png"
            ),
            Menus(
                id = 2,
                name = "Whopper Doble",
                description = "Doble carne a la parrilla con queso, vegetales frescos y mayonesa",
                imageUrl = "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_DOBLE_WHOPPER_500X540px.png"
            ),
            Menus(
                id = 3,
                name = "Chicken Fries",
                description = "Tiras de pollo crujiiente acompañadas de salsa",
                imageUrl = "https://burgerking.com.mt/wp-content/uploads/2020/03/Chicken-fries-500-x-500.png"
            )
        )
    ),
    Restaurant(
        id = 10,
        name = "La Pampa Argentina",
        description = "Restaurante elegante especializado en cortes premium y gastronomía argentina",
        imageUrl = "https://s.ineventos.com/sv/2014/10/112082/restaurantes-la-pampa-149855-i-640w.jpg",
        categories = listOf("Carnes", "Parrilla", "Gourmet"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Ribeye Premiumm",
                description = "Corte premium acompañado de vegetales salteados y papas gourmet",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGc1hd-4DD-nEcCqOZ4VYwkxn0L35pcRqGhQ&s"
            ),
            Menus(
                id = 2,
                name = "Filete Mignon",
                description = "Filete de res suave en salsa de vino con puré artesanal",
                imageUrl = "https://thumbs.dreamstime.com/b/filete-de-gourmet-mignon-steak-con-salsa-vino-del-puerto-pur%C3%A9-patatas-romero-aderezo-exposici%C3%B3n-gastron%C3%B3mica-elegante-y-384809400.jpg"
            ),
            Menus(
                id = 3,
                name = "Salmón a la parrilla",
                description = "Salmón fresco con mantequilla de  hierbas y espárragos",
                imageUrl = "https://www.hola.com/horizon/landscape/ae5503073445-salmon-age-t.jpg?im=Resize=(1200)"
            )
        )
    )
)