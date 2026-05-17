package com.pdm0126.foodspot.data.dummy

import android.view.Menu
import com.pdm0126.foodspot.data.model.CategoryMenu
import com.pdm0126.foodspot.data.model.Menus
import com.pdm0126.foodspot.data.model.Restaurant

val sampleRestaurant = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Place",
        description = "Las mejores pizzas artesanales de la ciudad",
        imageUrl = "https://images.squarespace-cdn.com/content/v1/627c020e5b1d930b0e349af2/c3321cbf-bc81-4ff6-a9e6-9d1e7296fc18/PP_logo_3color_web_large.png",
        categories = listOf("Pizzas"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Pizza Margarita",
                description = "Mozarella, albahaca y tomate fresco",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://i.pinimg.com/736x/76/ce/18/76ce18a00bda94201875548caaf90876.jpg"
            ),
            Menus(
                id =  2,
                name = "Pizza Pepperoni",
                categoria = CategoryMenu.Principales,
                description = "Pepperoni con queso mozzarella derretido",
                imageUrl = "https://i.pinimg.com/736x/3e/c9/fe/3ec9fe32c6217014789b5f42e2343f47.jpg"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "Pizza Boom",
        description = "Creando experiencias que despiertan tus sentidos",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1Zuvk0bj-U22DsB19rriAUAhqZtqSvPyW5g&s",
        categories = listOf("Pizzas"),
        menu =  listOf(
            Menus(
                id = 1,
                name = "Pizza Hawaiana",
                description = "Jamón Virginia,piña y cebolla",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://i.pinimg.com/1200x/9d/b7/50/9db750a4eafcf1d1fb551520018c8bf6.jpg"
            ),
            Menus (
                id = 2,
                name = "Boom 6",
                description = "Loroco y Queso",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://i.pinimg.com/736x/56/ab/91/56ab91ea27e6d89b76e0d02b54be2abc.jpg"
            ),
            Menus(
                id = 3,
                name = "Pizza de Camarones",
                description = "Camarones y Queso",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://i.pinimg.com/736x/76/4a/e3/764ae3bee75fa6080f8cd2610a3690c8.jpg"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Pizza Hut",
        description = "Nadie supera a The Hut en pizzas",
        imageUrl = "https://adage.com/resizer/v2/6N6FT5SYSRAPXMWNXSDAQD7YJM.jpg?auth=b352725033167239b2935822e4e4142aebea1fc5d2ca04e8d2853d46512b82d2&width=300",
        categories = listOf("Pizzas"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Pizza Chipotle Boom",
                description = "Carne, Tocino Picado, Queso mozzarella, Salsa Alfredo ,Salsa chipotle",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://www.pizzahut.com.sv/static/media/images/images/jpg/4550_1_08-11-2023-10-50.jpg"
            ),
            Menus(
                id = 2,
                name = "Pizza cuatro quesos ",
                description = "Mozzarella, Queso parmesano, Queso cheddar, Queso provolone",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://www.pizzahut.com.sv/static/media/images/images/jpg/4820_1_03-01-2024-21-52.jpg"
            ),
            Menus(
                id = 3,
                name = "Pizza Buffalo Chicken",
                description = "Salsa Alfredo, Trozos de pollo, Aderezo ranch, Salsa buffalo, Cebolla mmorada, elotito y cilantro",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://www.pizzahut.com.sv/static/media/images/images/jpg/1_13-06-2024-00-40_MD.jpg"
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "Papa Johns",
        description = "Mejores ingredientes. Mejor pizza. Papa John's",
        imageUrl = "https://comelongo.com/wp-content/uploads/2020/12/126246380_10158803843896670_4153352553538382066_n.jpg",
        categories = listOf("Pizzas"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Hawaiana Volcano",
                description = "Jalapeños, Piña, Jamón Canadiense, Tocino y Queso mozzarella",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://pjsv-images.nyc3.digitaloceanspaces.com/common-files/product-163/0761-hawaiana-volcano-v2.jpg"
            ),
            Menus(
                id = 2,
                name = "Carnívora",
                description = "Pepperoni, Salchicha, Carne de res, Tocino ahumedo, Jamón y Queso mozzarella",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://pjsv-images.nyc3.digitaloceanspaces.com/common-files/product-4/carnivora.jpg"
            ),
            Menus(
                id = 3,
                name = "Papadia",
                description = "Jamon y queso",
                categoria = CategoryMenu.Guarniciones,
                imageUrl = "https://pjsv-images.nyc3.digitaloceanspaces.com/common-files/product-156/7020-product-papadia-pepp-sauge.jpg"
            )
        )
    ),
    Restaurant(
        id = 5,
        name = "Little Caesar",
        description = "¡Pizza! ¡Pizza!",
        imageUrl = "https://i.pinimg.com/564x/22/45/80/224580315c673fd541fd018e0d32e29c.jpg",
        categories = listOf("Pizzas"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Ultimate Supreme",
                description = "Pepperoni, Salchicha Italiana, Champiñones, Cebolla y Chile Pimiento",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://mobilestatic.littlecaesars.com/weborderingimages/11616129-ce29-450e-af39-8d543f05ab78.jpg"
            ),
            Menus(
                id = 2,
                name = "3 Meat Treat",
                description = "Pepperoni, Salchicha Italiana y Tocino",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://mobilestatic.littlecaesars.com/weborderingimages/4fc71413-5a82-4626-bba9-041d8c22435d.jpg"
            ),
            Menus(
                id = 3,
                name = "Crazy Cheese Bread",
                description = "12 Palitos de pan cubiertos de 3 quesos: Parmesano, Muenster y Mozzarella",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://inturfiles.s3.us-east-2.amazonaws.com/folder/products/500X500/CRAZY_CHEESE_BREAD_d43499d.jpg"
            )
        )
    ),
    Restaurant(
        id = 6,
        name = "Pollo Campero",
        description = "Vivir a Todo Sabor",
        imageUrl = "https://logonoid.com/images/pollo-campero-logo.png",
        categories = listOf( "Street Food"),
        menu =  listOf(
            Menus(
                id = 1,
                name = "Menú súper campero",
                description = "3 piezas de pollo, 2 acompañamientos , 1 bebida, 1 pan o tortilla",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://hermanrest.misganancias.net/assets/uploads/f8eb75ee2e474f119b9c9bbcd77a6738.png"
            ),
            Menus (
                id = 2,
                name = "Menú súper campero alitas",
                description = "9 alitas , 1 aderezo, 2 acompañamientos, 1 pan y 1 bebida",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://hermanrest.misganancias.net/assets/uploads/2cf02403dbfeb6c204332a4132ca09dd.png"
            ),
            Menus(
                id = 3,
                name = "Tazón Campero",
                description = "Arroz con maiz y cilantro, frijoles charros, queso mozzarella, lechuga, pico de gallo, nachos en tiras, aguacate, cilantro, Pollo empanizado",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://d1ralsognjng37.cloudfront.net/89707d09-0bb5-4d59-93fb-ad8ddd8896cf.jpeg"
            )
        )
    ),
    Restaurant(
        id = 7,
        name = "KOI",
        description = "Bebidas premium hechas con ingredientes de alta calidad, inspiradas en la cultura del té asiático",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPYwB7gvSbQL1-aYpU_DZvDzwLCTDMxE2Yhw&s",
        categories = listOf("Asian Food"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Bubble Milk Tea",
                description = "Té negro con leche fresca y perlas de tapioca",
                categoria = CategoryMenu.Bebidas,
                imageUrl = "https://i.pinimg.com/736x/e6/59/2e/e6592e7815518c8a8d5311b4f6afbf30.jpg"
            ),
            Menus(
                id = 2 ,
                name = "Golden Bubble Milk",
                description = "Leche fresca con perlas doradas de tapioca y azúcar morena",
                categoria = CategoryMenu.Bebidas,
                imageUrl = "https://i.pinimg.com/1200x/b0/e1/67/b0e16714fde9dcfa1c20e2a27b86920a.jpg"
            ),
            Menus(
                id = 3,
                name = "KOI thé",
                description = "Té autentico con el sabor característico de KOI0",
                categoria = CategoryMenu.Bebidas,
                imageUrl = "https://awards.brandingforum.org/wp-content/uploads/2025/12/D.jpg"
            )
        )
    ),
    Restaurant(
        id = 8,
        name = "Starbucks",
        description = "Café premium , bebidas frías y postres en un ambiente acogedor",
        imageUrl = "https://static.vecteezy.com/system/resources/previews/022/636/386/non_2x/starbucks-logo-starbucks-icon-transparent-free-png.png",
        categories = listOf("Coffe Shop"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Caramel Frappuchino",
                description = "Bebida fría de café con caramelo, leche y crema batida",
                categoria = CategoryMenu.Bebidas,
                imageUrl = "https://cloudassets.starbucks.com/is/image/sbuxcorp/SBX20220323_CaramelFrapp?impolicy=1by1_wide_topcrop_630&crop=180,360,1440,1440&wid=630&hei=630&qlt=85"
            ),
            Menus(
                id = 2,
                name = "Mocha Frappuccino",
                description = "Café mezclado con chocolate, hielo y crema batida",
                categoria = CategoryMenu.Bebidas,
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEX-NAutxFgJfVtu8mQl8K6L7qqw7mx6sgWQ&s"
            ),
            Menus(
                id = 3,
                name = "Latte Vainilla",
                description = "Espresso suave con leche vaporizada y vainilla",
                categoria = CategoryMenu.Bebidas,
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbCgNBlmKlnK0i_TY76uy9d6M78VAUrsS5tw&s"
            )
        )
    ),
    Restaurant(
        id = 9,
        name = "Burger King",
        description = "Hamburguesas a la parrilla con ingredientes frescos y sabor auténtico",
        imageUrl = "https://logowik.com/content/uploads/images/310_burgerking.jpg",
        categories = listOf("Street Food"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Whopper",
                description = "Hamburguesas con carne a la parrilla, tomate,  lechuga, cebolla y pepinillos",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_WHOPPER_500X540px.png"
            ),
            Menus(
                id = 2,
                name = "Whopper Doble",
                description = "Doble carne a la parrilla con queso, vegetales frescos y mayonesa",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_DOBLE_WHOPPER_500X540px.png"
            ),
            Menus(
                id = 3,
                name = "Chicken Fries",
                description = "Tiras de pollo crujiiente acompañadas de salsa",
                categoria = CategoryMenu.Guarniciones,
                imageUrl = "https://burgerking.com.mt/wp-content/uploads/2020/03/Chicken-fries-500-x-500.png"
            )
        )
    ),
    Restaurant(
        id = 10,
        name = "La Pampa Argentina",
        description = "Restaurante elegante especializado en cortes premium y gastronomía argentina",
        imageUrl = "https://plazakristal.com/wp-content/uploads/plaza-kristal-tiendas-la-pampa.png",
        categories = listOf("Parilladas"),
        menu = listOf(
            Menus(
                id = 1,
                name = "Ribeye Premiumm",
                description = "Corte premium acompañado de vegetales salteados y papas gourmet",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://i.pinimg.com/1200x/3c/a9/9a/3ca99a55d718100b7dc154093d704410.jpg"
            ),
            Menus(
                id = 2,
                name = "Filete Mignon",
                description = "Filete de res suave en salsa de vino con puré artesanal",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://i.pinimg.com/1200x/aa/0f/25/aa0f25f4d9bb3327d1ceac5007b577c9.jpg"
            ),
            Menus(
                id = 3,
                name = "Salmón a la parrilla",
                description = "Salmón fresco con mantequilla de  hierbas y espárragos",
                categoria = CategoryMenu.Principales,
                imageUrl = "https://i.pinimg.com/1200x/17/16/6c/17166cc0075c7440662401d86f8125ac.jpg"
            ),
            Menus(
                id = 4,
                name = "Burrata con pesto",
                description = "Burrata cremosa acompañada de pesto artesanal, tomates cherry frescos y un toque de aceite de oliva extra virgen",
                categoria = CategoryMenu.Entradas,
                imageUrl = "https://i.pinimg.com/1200x/46/c2/01/46c201d94251715a6faaa442d8ab87bb.jpg"
            ),
            Menus(
                id = 5,
                name = "Ensalada César ",
                description = "Lechuga romana fresca, crutones crocantes, queso parmesano y aderezo César tradicional con pollo a la parrilla.",
                categoria = CategoryMenu.Entradas,
                imageUrl = "https://i.pinimg.com/1200x/58/4f/43/584f430dd54f19fd2a36e1391fcf7507.jpg"
            )
        )
    )
)