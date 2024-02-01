Author - Michael Holguin

Description:

This app is intended to help new Starbucks baristas  in training with memorizing 
how to make beverages, beverage components, as well as a cheat sheet for the shelf 
life of different products.

Information was gathered from this source created by Starbucks employees:
https://sbuxdates.com

The app itself consists of a main activity with a title and three buttons with the
options of Standard Builds, Beverage Component Recipes, and Shelf Life Standards. 
Once a button is clicked, a new activity is started and the user is met with a 
Heading of the option they chose, and below that, a recycler view displaying the
products within that option’s field. Clicking on a product then displays the steps
on how to make the product or information on the product’s shelf life.

Rather than have each and every option be built uniquely, I opted to create 
three objects: Drink, BeverageComponent, and ShelfItem–all of which had the 
data of the image, name, and instructions or details binded to them.

The UI was entirely created using XML, and I purposely chose colors associated
with the Starbucks brand for the layout of the entire app, including the status 
bar of an Android Device.

Photos:

![Main_Activity](https://github.com/mh623/Starbucks_Trainer_App/assets/78939178/f9d59b39-3f52-4a10-b1f6-608db1dcc7e7)
![Standard_Builds](https://github.com/mh623/Starbucks_Trainer_App/assets/78939178/6512cb22-8103-4735-bd29-6367f354cf3c)
![Beverage_Component_Recipes](https://github.com/mh623/Starbucks_Trainer_App/assets/78939178/b5491d33-e3eb-40ae-a896-af9cefdffce8)
![Shelf_Life_Standards](https://github.com/mh623/Starbucks_Trainer_App/assets/78939178/50188898-05e7-466f-9d0a-243d627d3bb6)
![Espresso_Instructions](https://github.com/mh623/Starbucks_Trainer_App/assets/78939178/cc42176d-043f-4051-8bef-2e87b28707f8)
![Teavana_Tea_Instructions](https://github.com/mh623/Starbucks_Trainer_App/assets/78939178/90ecb579-68d1-4667-a3cf-cc99d8464762)
![Coffee_And_Tea_Details](https://github.com/mh623/Starbucks_Trainer_App/assets/78939178/99836dbe-b6c2-4b84-a8cd-62064fd4f230)
