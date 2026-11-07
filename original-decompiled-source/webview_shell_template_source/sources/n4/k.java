package n4;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13992a = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static ImageButton a(SearchBar searchBar) {
        Drawable navigationIcon = searchBar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i6 = 0; i6 < searchBar.getChildCount(); i6++) {
            View childAt = searchBar.getChildAt(i6);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList b(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < materialToolbar.getChildCount(); i6++) {
            View childAt = materialToolbar.getChildAt(i6);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
