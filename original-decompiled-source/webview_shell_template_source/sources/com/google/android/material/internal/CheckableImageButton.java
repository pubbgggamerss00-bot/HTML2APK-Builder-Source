package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import l.m;
import u0.f0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CheckableImageButton extends m implements Checkable {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f12388z = {R.attr.state_checked};

    /* renamed from: v, reason: collision with root package name */
    public boolean f12389v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12390w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12391x;

    /* renamed from: y, reason: collision with root package name */
    public a f12392y;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        void b();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends b1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public boolean f12393u;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new b[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12393u = parcel.readInt() == 1;
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f12393u ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.htmltoapk.template.R.attr.imageButtonStyle);
        this.f12390w = true;
        this.f12391x = true;
        f0.m(this, new n4.a(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f12389v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        return this.f12389v ? View.mergeDrawableStates(super.onCreateDrawableState(i6 + 1), f12388z) : super.onCreateDrawableState(i6);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f12392y = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.s);
        setChecked(bVar.f12393u);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f12393u = this.f12389v;
        return bVar;
    }

    public void setCheckable(boolean z6) {
        if (this.f12390w != z6) {
            this.f12390w = z6;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.f12390w || this.f12389v == z6) {
            return;
        }
        this.f12389v = z6;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z6) {
        a aVar;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z6);
        if (zIsFocusable == z6 || (aVar = this.f12392y) == null) {
            return;
        }
        aVar.b();
    }

    public void setOnFocusableChangedListener(a aVar) {
        this.f12392y = aVar;
    }

    public void setPressable(boolean z6) {
        this.f12391x = z6;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        if (this.f12391x) {
            super.setPressed(z6);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f12389v);
    }
}
