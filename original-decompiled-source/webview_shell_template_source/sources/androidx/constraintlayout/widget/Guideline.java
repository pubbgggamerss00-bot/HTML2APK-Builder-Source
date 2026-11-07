package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean s;

    public Guideline(Context context) {
        super(context);
        this.s = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z6) {
        this.s = z6;
    }

    public void setGuidelineBegin(int i6) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.s && aVar.f749a == i6) {
            return;
        }
        aVar.f749a = i6;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i6) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.s && aVar.f751b == i6) {
            return;
        }
        aVar.f751b = i6;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f6) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.s && aVar.f753c == f6) {
            return;
        }
        aVar.f753c = f6;
        setLayoutParams(aVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
    }
}
