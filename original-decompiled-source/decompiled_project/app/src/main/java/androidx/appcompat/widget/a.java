package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.b;
import com.basitce.htmltoapk.R;
import java.util.ArrayList;
import l.h;
import l.i;
import l.j;
import l.k;
import l.n;
import m.l;
import m.m0;
import m.w;

/* loaded from: classes.dex */
public final class a extends l.a {

    /* renamed from: h, reason: collision with root package name */
    public d f656h;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f657j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f658k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f659l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f660m;

    /* renamed from: n, reason: collision with root package name */
    public int f661n;

    /* renamed from: p, reason: collision with root package name */
    public int f662p;

    /* renamed from: q, reason: collision with root package name */
    public int f663q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f664r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f665s;

    /* renamed from: t, reason: collision with root package name */
    public e f666t;

    /* renamed from: v, reason: collision with root package name */
    public C0008a f667v;

    /* renamed from: w, reason: collision with root package name */
    public c f668w;

    /* renamed from: x, reason: collision with root package name */
    public b f669x;

    /* renamed from: y, reason: collision with root package name */
    public final f f670y;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0008a extends i {
        public C0008a(Context context, n nVar, View view) {
            super(context, nVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if ((nVar.f16562w.A & 32) != 32) {
                View view2 = a.this.f656h;
                this.f16532e = view2 == null ? a.this.f16465g : view2;
            }
            f fVar = a.this.f670y;
            this.f16535h = fVar;
            h hVar = this.f16536i;
            if (hVar != null) {
                hVar.i(fVar);
            }
        }

        @Override // l.i
        public final void c() {
            a aVar = a.this;
            aVar.f667v = null;
            aVar.getClass();
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final e f673a;

        public c(e eVar) {
            this.f673a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.d dVar;
            a aVar = a.this;
            androidx.appcompat.view.menu.a aVar2 = aVar.f16461c;
            if (aVar2 != null && (dVar = aVar2.f624e) != null) {
                dVar.getClass();
            }
            androidx.appcompat.widget.b bVar = aVar.f16465g;
            if (bVar != null && bVar.getWindowToken() != null) {
                e eVar = this.f673a;
                if (eVar.b()) {
                    aVar.f666t = eVar;
                } else if (eVar.f16532e != null) {
                    eVar.d(0, 0, false, false);
                    aVar.f666t = eVar;
                }
            }
            aVar.f668w = null;
        }
    }

    public class d extends l implements b.a {

        /* renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0009a extends w {
            public C0009a(d dVar) {
                super(dVar);
            }

            @Override // m.w
            public final h b() {
                e eVar = a.this.f666t;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // m.w
            public final boolean c() {
                a.this.h();
                return true;
            }

            @Override // m.w
            public final boolean d() {
                a aVar = a.this;
                if (aVar.f668w != null) {
                    return false;
                }
                aVar.e();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            m0.a(this, getContentDescription());
            setOnTouchListener(new C0009a(this));
        }

        @Override // androidx.appcompat.widget.b.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.b.a
        public final boolean c() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.h();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.a aVar, View view) {
            super(context, aVar, view, true, R.attr.actionOverflowMenuStyle, 0);
            this.f16533f = 8388613;
            f fVar = a.this.f670y;
            this.f16535h = fVar;
            h hVar = this.f16536i;
            if (hVar != null) {
                hVar.i(fVar);
            }
        }

        @Override // l.i
        public final void c() {
            a aVar = a.this;
            androidx.appcompat.view.menu.a aVar2 = aVar.f16461c;
            if (aVar2 != null) {
                aVar2.c(true);
            }
            aVar.f666t = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        @Override // l.j.a
        public final void b(androidx.appcompat.view.menu.a aVar, boolean z10) {
            if (aVar instanceof n) {
                ((n) aVar).f16561v.j().c(false);
            }
            j.a aVar2 = a.this.f16463e;
            if (aVar2 != null) {
                aVar2.b(aVar, z10);
            }
        }

        @Override // l.j.a
        public final boolean c(androidx.appcompat.view.menu.a aVar) {
            a aVar2 = a.this;
            if (aVar == aVar2.f16461c) {
                return false;
            }
            ((n) aVar).f16562w.getClass();
            aVar2.getClass();
            j.a aVar3 = aVar2.f16463e;
            if (aVar3 != null) {
                return aVar3.c(aVar);
            }
            return false;
        }
    }

    public a(Context context) {
        this.f16459a = context;
        this.f16462d = LayoutInflater.from(context);
        this.f16464f = R.layout.abc_action_menu_item_layout;
        this.f665s = new SparseBooleanArray();
        this.f670y = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.k] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(l.f fVar, View view, androidx.appcompat.widget.b bVar) {
        View actionView = fVar.getActionView();
        if (actionView == null || fVar.c()) {
            ActionMenuItemView actionMenuItemView = view instanceof k ? (k) view : (k) this.f16462d.inflate(this.f16464f, (ViewGroup) bVar, false);
            actionMenuItemView.b(fVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f16465g);
            if (this.f669x == null) {
                this.f669x = new b();
            }
            actionMenuItemView2.setPopupCallback(this.f669x);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(fVar.F ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        bVar.getClass();
        if (!(layoutParams instanceof b.c)) {
            actionView.setLayoutParams(androidx.appcompat.widget.b.h(layoutParams));
        }
        return actionView;
    }

    @Override // l.j
    public final void b(androidx.appcompat.view.menu.a aVar, boolean z10) {
        e();
        C0008a c0008a = this.f667v;
        if (c0008a != null && c0008a.b()) {
            c0008a.f16536i.dismiss();
        }
        j.a aVar2 = this.f16463e;
        if (aVar2 != null) {
            aVar2.b(aVar, z10);
        }
    }

    @Override // l.j
    public final boolean d() {
        int size;
        ArrayList<l.f> arrayListK;
        int i10;
        boolean z10;
        a aVar = this;
        androidx.appcompat.view.menu.a aVar2 = aVar.f16461c;
        if (aVar2 != null) {
            arrayListK = aVar2.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i11 = aVar.f663q;
        int i12 = aVar.f662p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        androidx.appcompat.widget.b bVar = aVar.f16465g;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            l.f fVar = arrayListK.get(i13);
            int i16 = fVar.B;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (aVar.f664r && fVar.F) {
                i11 = 0;
            }
            i13++;
        }
        if (aVar.f659l && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = aVar.f665s;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            l.f fVar2 = arrayListK.get(i18);
            int i20 = fVar2.B;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = fVar2.f16505b;
            if (z12) {
                View viewA = aVar.a(fVar2, null, bVar);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                fVar2.d(z10);
            } else if ((i20 & 1) == z10) {
                boolean z13 = sparseBooleanArray.get(i21);
                boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                if (z14) {
                    View viewA2 = aVar.a(fVar2, null, bVar);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z14 &= i12 + i19 > 0;
                }
                if (z14 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z13) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        l.f fVar3 = arrayListK.get(i22);
                        if (fVar3.f16505b == i21) {
                            if ((fVar3.A & 32) == 32) {
                                i17++;
                            }
                            fVar3.d(false);
                        }
                    }
                }
                if (z14) {
                    i17--;
                }
                fVar2.d(z14);
            } else {
                fVar2.d(false);
                i18++;
                i10 = 2;
                aVar = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            aVar = this;
            z10 = true;
        }
        return z10;
    }

    public final boolean e() {
        androidx.appcompat.widget.b bVar;
        c cVar = this.f668w;
        if (cVar != null && (bVar = this.f16465g) != null) {
            bVar.removeCallbacks(cVar);
            this.f668w = null;
            return true;
        }
        e eVar = this.f666t;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.f16536i.dismiss();
        }
        return true;
    }

    @Override // l.j
    public final void f(Context context, androidx.appcompat.view.menu.a aVar) {
        this.f16460b = context;
        LayoutInflater.from(context);
        this.f16461c = aVar;
        Resources resources = context.getResources();
        if (!this.f660m) {
            this.f659l = true;
        }
        int i10 = 2;
        this.f661n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f663q = i10;
        int measuredWidth = this.f661n;
        if (this.f659l) {
            if (this.f656h == null) {
                d dVar = new d(this.f16459a);
                this.f656h = dVar;
                if (this.f658k) {
                    dVar.setImageDrawable(this.f657j);
                    this.f657j = null;
                    this.f658k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f656h.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f656h.getMeasuredWidth();
        } else {
            this.f656h = null;
        }
        this.f662p = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.j
    public final void g() {
        int i10;
        androidx.appcompat.widget.b bVar = this.f16465g;
        ArrayList<l.f> arrayList = null;
        boolean z10 = false;
        if (bVar != null) {
            androidx.appcompat.view.menu.a aVar = this.f16461c;
            if (aVar != null) {
                aVar.i();
                ArrayList<l.f> arrayListK = this.f16461c.k();
                int size = arrayListK.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.f fVar = arrayListK.get(i11);
                    if ((fVar.A & 32) == 32) {
                        View childAt = bVar.getChildAt(i10);
                        l.f itemData = childAt instanceof k ? ((k) childAt).getItemData() : null;
                        View viewA = a(fVar, childAt, bVar);
                        if (fVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewA);
                            }
                            this.f16465g.addView(viewA, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < bVar.getChildCount()) {
                if (bVar.getChildAt(i10) == this.f656h) {
                    i10++;
                } else {
                    bVar.removeViewAt(i10);
                }
            }
        }
        this.f16465g.requestLayout();
        androidx.appcompat.view.menu.a aVar2 = this.f16461c;
        if (aVar2 != null) {
            aVar2.i();
            ArrayList<l.f> arrayList2 = aVar2.f628i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                y3.b bVar2 = arrayList2.get(i12).D;
            }
        }
        androidx.appcompat.view.menu.a aVar3 = this.f16461c;
        if (aVar3 != null) {
            aVar3.i();
            arrayList = aVar3.f629j;
        }
        if (this.f659l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !arrayList.get(0).F;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f656h == null) {
                this.f656h = new d(this.f16459a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f656h.getParent();
            if (viewGroup2 != this.f16465g) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f656h);
                }
                androidx.appcompat.widget.b bVar3 = this.f16465g;
                d dVar = this.f656h;
                bVar3.getClass();
                b.c cVarG = androidx.appcompat.widget.b.g();
                cVarG.f685a = true;
                bVar3.addView(dVar, cVarG);
            }
        } else {
            d dVar2 = this.f656h;
            if (dVar2 != null) {
                ViewParent parent = dVar2.getParent();
                androidx.appcompat.widget.b bVar4 = this.f16465g;
                if (parent == bVar4) {
                    bVar4.removeView(this.f656h);
                }
            }
        }
        this.f16465g.setOverflowReserved(this.f659l);
    }

    public final void h() {
        androidx.appcompat.view.menu.a aVar;
        if (this.f659l) {
            e eVar = this.f666t;
            if ((eVar == null || !eVar.b()) && (aVar = this.f16461c) != null && this.f16465g != null && this.f668w == null) {
                aVar.i();
                if (aVar.f629j.isEmpty()) {
                    return;
                }
                c cVar = new c(new e(this.f16460b, this.f16461c, this.f656h));
                this.f668w = cVar;
                this.f16465g.post(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.j
    public final boolean k(n nVar) {
        boolean z10;
        if (nVar.hasVisibleItems()) {
            n nVar2 = nVar;
            while (true) {
                androidx.appcompat.view.menu.a aVar = nVar2.f16561v;
                if (aVar == this.f16461c) {
                    break;
                }
                nVar2 = (n) aVar;
            }
            l.f fVar = nVar2.f16562w;
            androidx.appcompat.widget.b bVar = this.f16465g;
            View view = null;
            if (bVar != null) {
                int childCount = bVar.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = bVar.getChildAt(i10);
                    if ((childAt instanceof k) && ((k) childAt).getItemData() == fVar) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view != null) {
                nVar.f16562w.getClass();
                int size = nVar.f625f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = nVar.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                C0008a c0008a = new C0008a(this.f16460b, nVar, view);
                this.f667v = c0008a;
                c0008a.f16534g = z10;
                h hVar = c0008a.f16536i;
                if (hVar != null) {
                    hVar.o(z10);
                }
                C0008a c0008a2 = this.f667v;
                if (!c0008a2.b()) {
                    if (c0008a2.f16532e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0008a2.d(0, 0, false, false);
                }
                j.a aVar2 = this.f16463e;
                if (aVar2 != null) {
                    aVar2.c(nVar);
                }
                return true;
            }
        }
        return false;
    }
}
