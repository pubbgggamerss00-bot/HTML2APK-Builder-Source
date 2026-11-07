package y3;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* loaded from: classes.dex */
public interface o {
    boolean a(MenuItem menuItem);

    default void b(Menu menu) {
    }

    void c(Menu menu, MenuInflater menuInflater);

    default void d(Menu menu) {
    }
}
