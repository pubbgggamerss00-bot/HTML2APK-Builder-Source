package l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y extends Spinner {

    @SuppressLint({"ResourceType"})
    public static final int[] A = {R.attr.spinnerMode};
    public final l.d s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f13750t;

    /* renamed from: u, reason: collision with root package name */
    public final x f13751u;

    /* renamed from: v, reason: collision with root package name */
    public SpinnerAdapter f13752v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13753w;

    /* renamed from: x, reason: collision with root package name */
    public final g f13754x;

    /* renamed from: y, reason: collision with root package name */
    public int f13755y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f13756z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            y yVar = y.this;
            if (!yVar.getInternalPopup().a()) {
                yVar.f13754x.n(yVar.getTextDirection(), yVar.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = yVar.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements g, DialogInterface.OnClickListener {
        public androidx.appcompat.app.b s;

        /* renamed from: t, reason: collision with root package name */
        public d f13757t;

        /* renamed from: u, reason: collision with root package name */
        public CharSequence f13758u;

        public c() {
        }

        @Override // l.y.g
        public final boolean a() {
            androidx.appcompat.app.b bVar = this.s;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // l.y.g
        public final int b() {
            return 0;
        }

        @Override // l.y.g
        public final void d(int i6) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // l.y.g
        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.s;
            if (bVar != null) {
                bVar.dismiss();
                this.s = null;
            }
        }

        @Override // l.y.g
        public final CharSequence e() {
            return this.f13758u;
        }

        @Override // l.y.g
        public final Drawable h() {
            return null;
        }

        @Override // l.y.g
        public final void j(CharSequence charSequence) {
            this.f13758u = charSequence;
        }

        @Override // l.y.g
        public final void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // l.y.g
        public final void l(int i6) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // l.y.g
        public final void m(int i6) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // l.y.g
        public final void n(int i6, int i7) {
            if (this.f13757t == null) {
                return;
            }
            y yVar = y.this;
            b.a aVar = new b.a(yVar.getPopupContext());
            CharSequence charSequence = this.f13758u;
            AlertController.b bVar = aVar.f127a;
            if (charSequence != null) {
                bVar.f117d = charSequence;
            }
            d dVar = this.f13757t;
            int selectedItemPosition = yVar.getSelectedItemPosition();
            bVar.f120g = dVar;
            bVar.h = this;
            bVar.f122j = selectedItemPosition;
            bVar.f121i = true;
            androidx.appcompat.app.b bVarA = aVar.a();
            this.s = bVarA;
            AlertController.RecycleListView recycleListView = bVarA.f126x.f96e;
            recycleListView.setTextDirection(i6);
            recycleListView.setTextAlignment(i7);
            this.s.show();
        }

        @Override // l.y.g
        public final int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i6) {
            y yVar = y.this;
            yVar.setSelection(i6);
            if (yVar.getOnItemClickListener() != null) {
                yVar.performItemClick(null, i6, this.f13757t.getItemId(i6));
            }
            dismiss();
        }

        @Override // l.y.g
        public final void p(ListAdapter listAdapter) {
            this.f13757t = (d) listAdapter;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter s;

        /* renamed from: t, reason: collision with root package name */
        public ListAdapter f13760t;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f13760t;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.s;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i6, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.s;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i6, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i6) {
            SpinnerAdapter spinnerAdapter = this.s;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i6);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i6) {
            SpinnerAdapter spinnerAdapter = this.s;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i6);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i6) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            return getDropDownView(i6, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.s;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i6) {
            ListAdapter listAdapter = this.f13760t;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i6);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.s;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.s;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e extends m0 implements g {
        public CharSequence U;
        public d V;
        public final Rect W;
        public int X;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j6) {
                e eVar = e.this;
                y yVar = y.this;
                yVar.setSelection(i6);
                if (yVar.getOnItemClickListener() != null) {
                    yVar.performItemClick(view, i6, eVar.V.getItemId(i6));
                }
                eVar.dismiss();
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e eVar = e.this;
                y yVar = y.this;
                eVar.getClass();
                if (!yVar.isAttachedToWindow() || !yVar.getGlobalVisibleRect(eVar.W)) {
                    eVar.dismiss();
                } else {
                    eVar.s();
                    eVar.f();
                }
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ b s;

            public c(b bVar) {
                this.s = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = y.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.s);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i6) {
            super(context, attributeSet, i6, 0);
            this.W = new Rect();
            this.G = y.this;
            this.Q = true;
            this.R.setFocusable(true);
            this.H = new a();
        }

        @Override // l.y.g
        public final CharSequence e() {
            return this.U;
        }

        @Override // l.y.g
        public final void j(CharSequence charSequence) {
            this.U = charSequence;
        }

        @Override // l.y.g
        public final void m(int i6) {
            this.X = i6;
        }

        @Override // l.y.g
        public final void n(int i6, int i7) {
            ViewTreeObserver viewTreeObserver;
            q qVar = this.R;
            boolean zIsShowing = qVar.isShowing();
            s();
            qVar.setInputMethodMode(2);
            f();
            i0 i0Var = this.f13699u;
            i0Var.setChoiceMode(1);
            i0Var.setTextDirection(i6);
            i0Var.setTextAlignment(i7);
            y yVar = y.this;
            int selectedItemPosition = yVar.getSelectedItemPosition();
            i0 i0Var2 = this.f13699u;
            if (qVar.isShowing() && i0Var2 != null) {
                i0Var2.setListSelectionHidden(false);
                i0Var2.setSelection(selectedItemPosition);
                if (i0Var2.getChoiceMode() != 0) {
                    i0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = yVar.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            qVar.setOnDismissListener(new c(bVar));
        }

        @Override // l.m0, l.y.g
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.V = (d) listAdapter;
        }

        public final void s() {
            int i6;
            y yVar = y.this;
            Rect rect = yVar.f13756z;
            q qVar = this.R;
            Drawable background = qVar.getBackground();
            if (background != null) {
                background.getPadding(rect);
                boolean z6 = i1.f13669a;
                i6 = yVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
            } else {
                i6 = 0;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = yVar.getPaddingLeft();
            int paddingRight = yVar.getPaddingRight();
            int width = yVar.getWidth();
            int i7 = yVar.f13755y;
            if (i7 == -2) {
                int iA = yVar.a(this.V, qVar.getBackground());
                int i8 = (yVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
                if (iA > i8) {
                    iA = i8;
                }
                r(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i7 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i7);
            }
            boolean z7 = i1.f13669a;
            this.f13702x = yVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f13701w) - this.X) + i6 : paddingLeft + this.X + i6;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public boolean s;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                f fVar = new f(parcel);
                fVar.s = parcel.readByte() != 0;
                return fVar;
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i6) {
                return new f[i6];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface g {
        boolean a();

        int b();

        void d(int i6);

        void dismiss();

        CharSequence e();

        Drawable h();

        void j(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i6);

        void m(int i6);

        void n(int i6, int i7);

        int o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(Context context, AttributeSet attributeSet, int i6) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i6);
        this.f13756z = new Rect();
        w0.a(getContext(), this);
        int[] iArr = f.a.f12952u;
        b1 b1VarE = b1.e(i6, 0, context, attributeSet, iArr);
        TypedArray typedArray = b1VarE.f13583b;
        this.s = new l.d(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f13750t = new j.c(context, resourceId);
        } else {
            this.f13750t = context;
        }
        int i7 = -1;
        TypedArray typedArray2 = null;
        try {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A, i6, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i7 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e6) {
                    e = e6;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    if (i7 != 0) {
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                    }
                    b1VarE.f();
                    this.f13753w = true;
                    spinnerAdapter = this.f13752v;
                    if (spinnerAdapter != null) {
                    }
                    this.s.d(attributeSet, i6);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i7 != 0) {
            c cVar = new c();
            this.f13754x = cVar;
            cVar.f13758u = typedArray.getString(2);
        } else if (i7 == 1) {
            e eVar = new e(this.f13750t, attributeSet, i6);
            b1 b1VarE2 = b1.e(i6, 0, this.f13750t, attributeSet, iArr);
            this.f13755y = b1VarE2.f13583b.getLayoutDimension(3, -2);
            eVar.k(b1VarE2.b(1));
            eVar.U = typedArray.getString(2);
            b1VarE2.f();
            this.f13754x = eVar;
            this.f13751u = new x(this, this, eVar);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.htmltoapk.template.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        b1VarE.f();
        this.f13753w = true;
        spinnerAdapter = this.f13752v;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f13752v = null;
        }
        this.s.d(attributeSet, i6);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i6 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f13756z;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        l.d dVar = this.s;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f13754x;
        return gVar != null ? gVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f13754x;
        return gVar != null ? gVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f13754x != null ? this.f13755y : super.getDropDownWidth();
    }

    public final g getInternalPopup() {
        return this.f13754x;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f13754x;
        return gVar != null ? gVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f13750t;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f13754x;
        return gVar != null ? gVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        l.d dVar = this.s;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l.d dVar = this.s;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f13754x;
        if (gVar == null || !gVar.a()) {
            return;
        }
        gVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.f13754x == null || View.MeasureSpec.getMode(i6) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.s || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f13754x;
        fVar.s = gVar != null && gVar.a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x xVar = this.f13751u;
        if (xVar == null || !xVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        g gVar = this.f13754x;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        gVar.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        l.d dVar = this.s;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        l.d dVar = this.s;
        if (dVar != null) {
            dVar.f(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i6) {
        g gVar = this.f13754x;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i6);
        } else {
            gVar.m(i6);
            gVar.d(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i6) {
        g gVar = this.f13754x;
        if (gVar != null) {
            gVar.l(i6);
        } else {
            super.setDropDownVerticalOffset(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i6) {
        if (this.f13754x != null) {
            this.f13755y = i6;
        } else {
            super.setDropDownWidth(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f13754x;
        if (gVar != null) {
            gVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i6) {
        setPopupBackgroundDrawable(y5.b0.d(getPopupContext(), i6));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f13754x;
        if (gVar != null) {
            gVar.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        l.d dVar = this.s;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        l.d dVar = this.s;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f13753w) {
            this.f13752v = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        g gVar = this.f13754x;
        if (gVar != null) {
            Context context = this.f13750t;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            d dVar = new d();
            dVar.s = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                dVar.f13760t = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    b.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof x0) {
                    x0 x0Var = (x0) spinnerAdapter;
                    if (x0Var.getDropDownViewTheme() == null) {
                        x0Var.a();
                    }
                }
            }
            gVar.p(dVar);
        }
    }
}
