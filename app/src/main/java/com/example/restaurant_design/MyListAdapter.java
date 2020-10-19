package com.example.restaurant_design;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private Context mcontext;
    private List<Resturant> listdata;


    public MyListAdapter(Context mcontext, List<Resturant> listdata) {
        this.mcontext = mcontext;
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.listitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Resturant myListData = listdata.get(position);
        holder.img.setImageResource(listdata.get(position).getimag());
        holder.nameitem.setText(listdata.get(position).getnameitem());
        holder.countsitem.setText(listdata.get(position).getnumbersitem());

        holder.arrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (holder.getAdapterPosition() == 0) {
                    holder.img.setDrawingCacheEnabled(true);
                    Bitmap b=  holder.img.getDrawingCache();
                    String nameitem= holder.nameitem.getText().toString().trim();
                    Intent i = new Intent(mcontext, Info_Element_Activity.class);
                    i.putExtra("Bitmap", b);
                    i.putExtra("Nameitem", nameitem);
                    i.putExtra("DES" , "is a savory dish of Italian origin consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients (such as anchovies, mushrooms, onions, olives, pineapple, meat, etc.) which is then baked at a high temperature, traditionally in a wood-fired oven.[1] A small pizza is sometimes called a pizzetta. A person who makes pizza is known as a pizzaiolo. And there is many of types from pizza first Crust second Cheese");
                    mcontext.startActivity(i);

                }

                if (holder.getAdapterPosition() == 1) {

                    holder.img.setDrawingCacheEnabled(true);
                    Bitmap b=  holder.img.getDrawingCache();
                    String nameitem= holder.nameitem.getText().toString().trim();
                    Intent i = new Intent(mcontext, Info_Element_Activity.class);
                    i.putExtra("Bitmap", b);
                    i.putExtra("Nameitem", nameitem);
                    i.putExtra("DES" ,"is a type of food typically made from an unleavened dough of wheat flour mixed with water or eggs, and formed into sheets or other shapes, then cooked by boiling or baking. Rice flour, or legumes such as beans or lentils, are sometimes used in place of wheat flour to yield a different taste and texture, or as a gluten-free alternative. Pasta is a staple food of Italian cuisine.\n" +
                            "\n" +
                            "Pastas are divided into two broad categories: dried and fresh . Most dried pasta is produced commercially via an extrusion process, although it can be produced at home. Fresh pasta is traditionally produced by hand, sometimes with the aid of simple machines. Fresh pastas available in grocery stores are produced commercially by large-scale machines.");
                    mcontext.startActivity(i);
                }

                if (holder.getAdapterPosition() == 2) {

                    holder.img.setDrawingCacheEnabled(true);
                    Bitmap b=  holder.img.getDrawingCache();
                    String nameitem= holder.nameitem.getText().toString().trim();
                    Intent i = new Intent(mcontext, Info_Element_Activity.class);
                    i.putExtra("Bitmap", b);
                    i.putExtra("Nameitem", nameitem);
                    i.putExtra("DES" ," is a dish consisting of pieces of food in a mixture, with at least one raw ingredient. It is often dressed, and is typically served at room temperature or chilled, though some (such as south German potato salad, or chicken salad) can be served warm.\n" +
                            "\n" +
                            "Garden salads use a base of leafy greens such as lettuce, arugula/rocket, kale or spinach; they are common enough that the word salad alone often refers specifically to garden salads. Other types include bean salad, tuna salad, fattoush, Greek salad (vegetable-based, but without leafy greens), and sōmen salad (a noodle-based salad). The sauce used to flavor a salad is generally called a salad dressing; most salad dressings are based on either a mixture of oil and vinegar or a fermented milk product like kefir.");
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 3) {

                    holder.img.setDrawingCacheEnabled(true);
                    Bitmap b=  holder.img.getDrawingCache();
                    String nameitem= holder.nameitem.getText().toString().trim();
                    Intent i = new Intent(mcontext, Info_Element_Activity.class);
                    i.putExtra("Bitmap", b);
                    i.putExtra("Nameitem", nameitem);
                    i.putExtra("DES" ,"(also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled. Hamburgers are often served with cheese, lettuce, tomato, onion, pickles, bacon, or chiles; condiments such as ketchup, mustard, mayonnaise, relish, or a \"special sauce\", often a variation of Thousand Island dressing; and are frequently placed on sesame seed buns. A hamburger topped with cheese is called a cheeseburger.\n" +
                            "\n" +
                            "The term \"burger\" can also be applied to the meat patty on its own, especially in the United Kingdom, where the term \"patty\" is rarely used, or the term can even refer simply to ground beef. Since the term hamburger usually implies beef, for clarity \"burger\" may be prefixed with the type of meat or meat substitute used, as in beef burger, turkey burger, bison burger, or veggie burger.\n" +
                            "\n" +
                            "Hamburgers are sold at fast-food restaurants, diners, and specialty and high-end restaurants (where burgers may sell for several times the cost of a fast-food burger, but may be one of the cheaper options on the menu). There are many international and regional variations of the hamburger.");
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 4) {

                    holder.img.setDrawingCacheEnabled(true);
                    Bitmap b=  holder.img.getDrawingCache();
                    String nameitem= holder.nameitem.getText().toString().trim();
                    Intent i = new Intent(mcontext, Info_Element_Activity.class);
                    i.putExtra("Bitmap", b);
                    i.putExtra("Nameitem", nameitem);
                    i.putExtra("DES" ,"is a liquid intended for human consumption. In addition to their basic function of satisfying thirst, drinks play important roles in human culture. Common types of drinks include plain drinking water, milk, coffee, tea, hot chocolate, juice and soft drinks. In addition, alcoholic drinks such as wine, beer, and liquor, which contain the drug ethanol, have been part of human culture for more than 8,000 years.\n" +
                            "\n" +
                            "Non-alcoholic drinks often signify drinks that would normally contain alcohol, such as beer and wine, but are made with a sufficiently low concentration of alcohol by volume. The category includes drinks that have undergone an alcohol removal process such as non-alcoholic beers and de-alcoholized wines.");
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 5) {

                    holder.img.setDrawingCacheEnabled(true);
                    Bitmap b=  holder.img.getDrawingCache();
                    String nameitem= holder.nameitem.getText().toString().trim();
                    Intent i = new Intent(mcontext, Info_Element_Activity.class);
                    i.putExtra("Bitmap", b);
                    i.putExtra("Nameitem", nameitem);
                    i.putExtra("DES" ," is a grilled or steamed food where a sausage is served in the slit of a partially sliced bun.[4] It can also refer to the sausage itself. The sausage used is the wiener (Vienna sausage) or frankfurter (Frankfurter Würstchen, also just called frank). The names of these sausages also commonly refer to their assembled dish.[5] Hot dog preparation and condiments vary worldwide. Typical condiments include mustard, ketchup, mayonnaise, relish, and cheese sauce, and common garnishes include onions, sauerkraut, jalapeños, chili, grated cheese, coleslaw, bacon, and olives. Hot dog variants include the corn dog and pigs in a blanket. The hot dog's cultural traditions include the Nathan's Hot Dog Eating Contest and the Oscar Mayer Wienermobile.");
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 6) {

                    holder.img.setDrawingCacheEnabled(true);
                    Bitmap b=  holder.img.getDrawingCache();
                    String nameitem= holder.nameitem.getText().toString().trim();
                    Intent i = new Intent(mcontext, Info_Element_Activity.class);
                    i.putExtra("Bitmap", b);
                    i.putExtra("Nameitem", nameitem);
                    i.putExtra("DES" ,"fries, chips or finger chips or French-fried potatoes, are batonnet or allumette-cut deep-fried potatoes.\n" +
                            "\n" +
                            "French fries are served hot, either soft or crispy, and are generally eaten as part of lunch or dinner or by themselves as a snack, and they commonly appear on the menus of diners, fast food restaurants, pubs, and bars. They are usually salted and, depending on the country, may be served with ketchup, vinegar, mayonnaise, tomato sauce, or other local specialties. Fries can be topped more heavily, as in the dishes of poutine or chili cheese fries. Chips can be made from sweet potatoes instead of potatoes. A baked variant, oven chips, uses less oil or no oil.");
                    mcontext.startActivity(i);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameitem;
        public TextView countsitem;
        public ImageView img;
        ImageView arrowimg;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.img = itemView.findViewById(R.id.list_item1_imageView);
            this.arrowimg=itemView.findViewById(R.id.list_item1_arrow);
            this.nameitem = itemView.findViewById(R.id.list_item1_title_textView);
            this.countsitem = itemView.findViewById(R.id.list_item1_itemsCount_textView);


        }
    }
}
