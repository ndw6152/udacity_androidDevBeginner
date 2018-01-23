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

    ///// button functions
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        int price = calculatePrice(quantity);
        displaySummary(quantity, price);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        displayQuantity(++quantity);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void decrement(View view) {
        if(--quantity < 0)
            quantity = 0;
        displayQuantity(quantity);
    }

    ///// /button functions

    /**
     * This method displays the summary of the order with the quantity and total price
     */
    private void displaySummary(int quantity, int price) {
        TextView quantityTextView = (TextView) findViewById(R.id.order_summary_text_view);
        quantityTextView.setText("Quantity = " + quantity + "\nTotal = $" + price);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffee) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffee);
    }

    /**
     * This method displays the given price value for the quantity of order on the screen.
     */
    private void displayPrice(int price) {
        TextView quantityTextView = (TextView) findViewById(R.id.order_summary_text_view);
        quantityTextView.setText("Total = $" + price);
    }

    /**
     * Calculates the price of the order based on the current quantity.
     * @return the price
     */
    private int calculatePrice(int quantity) {
        return quantity * CONST_PRICE;
    }
}
