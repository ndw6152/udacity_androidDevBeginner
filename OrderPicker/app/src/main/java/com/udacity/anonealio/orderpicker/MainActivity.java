package com.udacity.anonealio.orderpicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    private int quantity = 0;
    private int CONST_PRICE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayPrice(quantity);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        display(++quantity);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void decrement(View view) {
        if(--quantity < 0)
            quantity=0;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price value for the quantity of order on the screen.
     */
    private void displayPrice(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.value_text_view);
        quantityTextView.setText("$" + number * CONST_PRICE);
    }
}
