package s3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* loaded from: classes.dex */
public interface b extends MenuItem {
    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    b setTooltipText(CharSequence charSequence);

    b u(y3.b bVar);
}
