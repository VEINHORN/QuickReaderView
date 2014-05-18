# QuickReaderView

## Usage

### Defining your layout
```
<com.example.QuickReaderView
        android:text="dsfsdfsd"
        android:id="@+id/quick_reader_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="40sp"
        android:textColor="#ffcc0000"/>
```

### Working on your activity
```
public class MainActivity extends Activity {
    private QuickReaderView quickReaderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quickReaderView = (QuickReaderView)findViewById(R.id.quick_reader_view);
        String text = "Design is the creation of a plan or convention for the construction of an object or a system as in architectural blueprints engineering drawings business processes circuit diagrams and sewing patterns Design has different connotations in different fields see design disciplines below In some cases the direct construction of an object as in pottery engineering management cowboy coding and graphic design is also considered to be design";
        quickReaderView.setDelay(400).showText(text);
    }
}
```
