package net.albertogarrido.resume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import net.albertogarrido.resume.domain.MyClass;
import net.albertogarrido.resume.domain.entities.Human;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.hello_text);
        MyClass myClass = new MyClass();
        Human vm = Human.create("Alberto");

        tv.setText(myClass.greetingWith(vm.name()));

        Log.d("TAG", vm.toString());

    }

}
