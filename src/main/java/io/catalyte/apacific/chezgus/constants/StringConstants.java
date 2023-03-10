package io.catalyte.apacific.chezgus.constants;

public class StringConstants {

    //endpoint constants
    public static final String CONTEXT_ORDERS = "/orders";
    public static final String CONTEXT_ITEMS = "/items";
    public static final String ID_ENDPOINT = "/{id}";
    public static final String ORDER_ID_ENDPOINT = "/{orderId}";


    //error constants
    public static final String SERVICE_UNAVAILABLE =
            "The database is not running, service is unavailable at the moment";
    public static final String UNEXPECTED_SERVER_ERROR = "An unexpected server error has occurred";
    public static final String NOT_FOUND = "Not Found";
    public static final String ID_NOT_FOUND =
            "You attempted an operation on an id that does not exist in the database";
    public static final String ID_MUST_MATCH = "ID must match the ID specified in the URL.";
    public static final String INVALID_POSITIVE = "A positive value is required for this field";
    public static final String ITEM_ID_NOT_FOUND =
            "There is no item " + "matching this id in the database";
    public static final String ORDER_ID_NOT_FOUND = "This order id isn't in the database";
    public static final String ORDER_ID_MUST_MATCH =
            "The order id must match" + " orderId";
    public static final String ORDER_CONFLICT = "Order has existing items";
    public static final String BAD_DATA = "Bad Data";
    public static final String BAD_REQUEST_DECIMAL =
            "Item price must " + "have exactly 2 decimal places";
    public static final String SERVER_ERROR = "Server Error";
    public static final String UNEXPECTED_ERROR = "Unexpected Server Error";
    public static final String VALIDATION_ERROR = "Validation Error";

    //response status constants
    public static final String HTTP_200 = "OK";
    public static final String HTTP_201 = "CREATED";
    public static final String HTTP_204 = "DELETED";
    public static final String HTTP_400 = "BAD DATA";
    public static final String HTTP_404 = "NOT FOUND";
    public static final String HTTP_409 = "DATA CONFLICT";

    //validation constants
    public static final String GENERATED_ID = "The database generated ID";
    public static final String ITEM_DESCRIPTION = "Description of the menu item";
    public static final String ITEM_NAME = "Name of the menu item";
    public static final String REQUIRED_FIELD = "Field is required";
}
