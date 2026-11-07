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
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import l.e1;
import l.k0;
import l.o;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends androidx.appcompat.view.menu.a {
    public d A;
    public Drawable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final SparseBooleanArray J;
    public e K;
    public C0007a L;
    public c M;
    public b N;
    public final f O;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0007a extends i {
        public C0007a(Context context, m mVar, View view) {
            super(R.attr.actionOverflowMenuStyle, 0, context, view, mVar, false);
            if ((mVar.A.f215x & 32) != 32) {
                View view2 = a.this.A;
                this.f224f = view2 == null ? (View) a.this.f144z : view2;
            }
            f fVar = a.this.O;
            this.f226i = fVar;
            k.d dVar = this.f227j;
            if (dVar != null) {
                dVar.d(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a aVar = a.this;
            aVar.L = null;
            aVar.getClass();
            super.c();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements Runnable {
        public final e s;

        public c(e eVar) {
            this.s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            a aVar2 = a.this;
            androidx.appcompat.view.menu.f fVar = aVar2.f139u;
            if (fVar != null && (aVar = fVar.f174e) != null) {
                aVar.b(fVar);
            }
            View view = (View) aVar2.f144z;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.s;
                if (eVar.b()) {
                    aVar2.K = eVar;
                } else if (eVar.f224f != null) {
                    eVar.d(0, 0, false, false);
                    aVar2.K = eVar;
                }
            }
            aVar2.M = null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d extends o implements ActionMenuView.a {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0008a extends k0 {
            public C0008a(d dVar) {
                super(dVar);
            }

            @Override // l.k0
            public final k.f b() {
                e eVar = a.this.K;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // l.k0
            public final boolean c() {
                a.this.l();
                return true;
            }

            @Override // l.k0
            public final boolean d() {
                a aVar = a.this;
                if (aVar.M != null) {
                    return false;
                }
                aVar.f();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            e1.a(this, getContentDescription());
            setOnTouchListener(new C0008a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.l();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i6, int i7, int i8, int i9) {
            boolean frame = super.setFrame(i6, i7, i8, i9);
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

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, View view) {
            super(R.attr.actionOverflowMenuStyle, 0, context, view, fVar, true);
            this.f225g = 8388613;
            f fVar2 = a.this.O;
            this.f226i = fVar2;
            k.d dVar = this.f227j;
            if (dVar != null) {
                dVar.d(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a aVar = a.this;
            androidx.appcompat.view.menu.f fVar = aVar.f139u;
            if (fVar != null) {
                fVar.c(true);
            }
            aVar.K = null;
            super.c();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z6) {
            if (fVar instanceof m) {
                ((m) fVar).f237z.k().c(false);
            }
            j.a aVar = a.this.f141w;
            if (aVar != null) {
                aVar.b(fVar, z6);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            a aVar = a.this;
            if (fVar == aVar.f139u) {
                return false;
            }
            ((m) fVar).A.getClass();
            aVar.getClass();
            j.a aVar2 = aVar.f141w;
            if (aVar2 != null) {
                return aVar2.c(fVar);
            }
            return false;
        }
    }

    public a(Context context) {
        this.s = context;
        this.f140v = LayoutInflater.from(context);
        this.f142x = R.layout.abc_action_menu_layout;
        this.f143y = R.layout.abc_action_menu_item_layout;
        this.J = new SparseBooleanArray();
        this.O = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.appcompat.view.menu.k$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof k.a ? (k.a) view : (k.a) this.f140v.inflate(this.f143y, viewGroup, false);
            actionMenuItemView.c(hVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f144z);
            if (this.N == null) {
                this.N = new b();
            }
            actionMenuItemView2.setPopupCallback(this.N);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(hVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.c)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(androidx.appcompat.view.menu.f fVar, boolean z6) {
        f();
        C0007a c0007a = this.L;
        if (c0007a != null && c0007a.b()) {
            c0007a.f227j.dismiss();
        }
        j.a aVar = this.f141w;
        if (aVar != null) {
            aVar.b(fVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        int size;
        ArrayList<h> arrayListL;
        int i6;
        boolean z6;
        a aVar = this;
        androidx.appcompat.view.menu.f fVar = aVar.f139u;
        if (fVar != null) {
            arrayListL = fVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i7 = aVar.H;
        int i8 = aVar.G;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f144z;
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i6 = 2;
            z6 = true;
            if (i9 >= size) {
                break;
            }
            h hVar = arrayListL.get(i9);
            int i12 = hVar.f216y;
            if ((i12 & 2) == 2) {
                i10++;
            } else if ((i12 & 1) == 1) {
                i11++;
            } else {
                z7 = true;
            }
            if (aVar.I && hVar.C) {
                i7 = 0;
            }
            i9++;
        }
        if (aVar.D && (z7 || i11 + i10 > i7)) {
            i7--;
        }
        int i13 = i7 - i10;
        SparseBooleanArray sparseBooleanArray = aVar.J;
        sparseBooleanArray.clear();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            h hVar2 = arrayListL.get(i14);
            int i16 = hVar2.f216y;
            boolean z8 = (i16 & 2) == i6 ? z6 : false;
            int i17 = hVar2.f195b;
            if (z8) {
                View viewA = aVar.a(hVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                if (i17 != 0) {
                    sparseBooleanArray.put(i17, z6);
                }
                hVar2.f(z6);
            } else if ((i16 & 1) == z6) {
                boolean z9 = sparseBooleanArray.get(i17);
                boolean z10 = ((i13 > 0 || z9) && i8 > 0) ? z6 : false;
                if (z10) {
                    View viewA2 = aVar.a(hVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z10 &= i8 + i15 > 0;
                }
                if (z10 && i17 != 0) {
                    sparseBooleanArray.put(i17, true);
                } else if (z9) {
                    sparseBooleanArray.put(i17, false);
                    for (int i18 = 0; i18 < i14; i18++) {
                        h hVar3 = arrayListL.get(i18);
                        if (hVar3.f195b == i17) {
                            if ((hVar3.f215x & 32) == 32) {
                                i13++;
                            }
                            hVar3.f(false);
                        }
                    }
                }
                if (z10) {
                    i13--;
                }
                hVar2.f(z10);
            } else {
                hVar2.f(false);
                i14++;
                i6 = 2;
                aVar = this;
                z6 = true;
            }
            i14++;
            i6 = 2;
            aVar = this;
            z6 = true;
        }
        return z6;
    }

    public final boolean f() {
        Object obj;
        c cVar = this.M;
        if (cVar != null && (obj = this.f144z) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.M = null;
            return true;
        }
        e eVar = this.K;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.f227j.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f138t = context;
        LayoutInflater.from(context);
        this.f139u = fVar;
        Resources resources = context.getResources();
        if (!this.E) {
            this.D = true;
        }
        int i6 = 2;
        this.F = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600 || ((i7 > 960 && i8 > 720) || (i7 > 720 && i8 > 960))) {
            i6 = 5;
        } else if (i7 >= 500 || ((i7 > 640 && i8 > 480) || (i7 > 480 && i8 > 640))) {
            i6 = 4;
        } else if (i7 >= 360) {
            i6 = 3;
        }
        this.H = i6;
        int measuredWidth = this.F;
        if (this.D) {
            if (this.A == null) {
                d dVar = new d(this.s);
                this.A = dVar;
                if (this.C) {
                    dVar.setImageDrawable(this.B);
                    this.B = null;
                    this.C = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.A.getMeasuredWidth();
        } else {
            this.A = null;
        }
        this.G = measuredWidth;
        float f6 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void h() {
        int i6;
        ViewGroup viewGroup = (ViewGroup) this.f144z;
        ArrayList<h> arrayList = null;
        boolean z6 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f139u;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> arrayListL = this.f139u.l();
                int size = arrayListL.size();
                i6 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    h hVar = arrayListL.get(i7);
                    if ((hVar.f215x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i6);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View viewA = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f144z).addView(viewA, i6);
                        }
                        i6++;
                    }
                }
            } else {
                i6 = 0;
            }
            while (i6 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i6) == this.A) {
                    i6++;
                } else {
                    viewGroup.removeViewAt(i6);
                }
            }
        }
        ((View) this.f144z).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f139u;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.f177i;
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                u0.b bVar = arrayList2.get(i8).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f139u;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f178j;
        }
        if (this.D && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z6 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.A == null) {
                this.A = new d(this.s);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.A.getParent();
            if (viewGroup3 != this.f144z) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.A);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f144z;
                d dVar = this.A;
                actionMenuView.getClass();
                ActionMenuView.c cVarJ = ActionMenuView.j();
                cVarJ.f253a = true;
                actionMenuView.addView(dVar, cVarJ);
            }
        } else {
            d dVar2 = this.A;
            if (dVar2 != null) {
                Object parent = dVar2.getParent();
                Object obj = this.f144z;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.A);
                }
            }
        }
        ((ActionMenuView) this.f144z).setOverflowReserved(this.D);
    }

    public final boolean i() {
        e eVar = this.K;
        return eVar != null && eVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final boolean j(m mVar) {
        boolean z6;
        if (mVar.hasVisibleItems()) {
            m mVar2 = mVar;
            while (true) {
                androidx.appcompat.view.menu.f fVar = mVar2.f237z;
                if (fVar == this.f139u) {
                    break;
                }
                mVar2 = (m) fVar;
            }
            h hVar = mVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.f144z;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i6);
                    if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == hVar) {
                        view = childAt;
                        break;
                    }
                    i6++;
                }
            }
            if (view != null) {
                mVar.A.getClass();
                int size = mVar.f175f.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        z6 = false;
                        break;
                    }
                    MenuItem item = mVar.getItem(i7);
                    if (item.isVisible() && item.getIcon() != null) {
                        z6 = true;
                        break;
                    }
                    i7++;
                }
                C0007a c0007a = new C0007a(this.f138t, mVar, view);
                this.L = c0007a;
                c0007a.h = z6;
                k.d dVar = c0007a.f227j;
                if (dVar != null) {
                    dVar.o(z6);
                }
                C0007a c0007a2 = this.L;
                if (!c0007a2.b()) {
                    if (c0007a2.f224f == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0007a2.d(0, 0, false, false);
                }
                j.a aVar = this.f141w;
                if (aVar != null) {
                    aVar.c(mVar);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.D || i() || (fVar = this.f139u) == null || this.f144z == null || this.M != null) {
            return false;
        }
        fVar.i();
        if (fVar.f178j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f138t, this.f139u, this.A));
        this.M = cVar;
        ((View) this.f144z).post(cVar);
        return true;
    }
}
