
import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import hr.com.hrapp.*;

/**
 * Created by Mohammad.Yeaaqbi on 5/17/16.
 */
public class CommonUtils {


    public static void SetFontFaceTypeForViews(View viewObj , Context context){
        Typeface fontType = Typeface.createFromAsset(context.getAssets(), "fonts/bein-ar-normal.ttf");
            if(viewObj instanceof TextView)
                ((TextView) viewObj).setTypeface(fontType);
            else if(viewObj instanceof Button)
                ((TextView) viewObj).setTypeface(fontType);
    }





}
