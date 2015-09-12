# QuickReaderView

QuickReaderView allows to show splitted by words text in TextView based view with specified speed. Just call setDelay() method to set wpm speed and showText() to show. Also you can call repeat(boolean repeatFlag) method to set repeat.

![UITableView](http://i.imgur.com/gfaAlY7.gif)
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
        quickReaderView.setWordsPerSecond(400).setRepeat(true).showText(text); // words per second, to set repeat and show text
    }
}
```

### License

    Copyright 2014, 2015 Boris Korogvich

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

