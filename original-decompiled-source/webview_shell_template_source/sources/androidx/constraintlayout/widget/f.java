package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends View {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public View f915t;

    /* renamed from: u, reason: collision with root package name */
    public int f916u;

    public View getContent() {
        return this.f915t;
    }

    public int getEmptyVisibility() {
        return this.f916u;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i6) {
        View viewFindViewById;
        if (this.s == i6) {
            return;
        }
        View view = this.f915t;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f915t.getLayoutParams()).f760f0 = false;
            this.f915t = null;
        }
        this.s = i6;
        if (i6 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i6)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i6) {
        this.f916u = i6;
    }
}
