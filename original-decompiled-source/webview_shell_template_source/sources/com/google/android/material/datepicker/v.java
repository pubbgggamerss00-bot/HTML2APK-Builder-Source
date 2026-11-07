package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.htmltoapk.template.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.e1;
import u0.f0;
import u0.n0;
import u0.q0;
import u0.u0;
import u0.v0;
import u0.w0;
import u0.x0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class v<S> extends androidx.fragment.app.j {
    public final LinkedHashSet<w<? super S>> B0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> C0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> D0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> E0 = new LinkedHashSet<>();
    public int F0;
    public d<S> G0;
    public e0<S> H0;
    public com.google.android.material.datepicker.a I0;
    public f J0;
    public j<S> K0;
    public int L0;
    public CharSequence M0;
    public boolean N0;
    public int O0;
    public int P0;
    public CharSequence Q0;
    public int R0;
    public CharSequence S0;
    public int T0;
    public CharSequence U0;
    public int V0;
    public CharSequence W0;
    public TextView X0;
    public TextView Y0;
    public CheckableImageButton Z0;

    /* renamed from: a1, reason: collision with root package name */
    public u4.g f12293a1;

    /* renamed from: b1, reason: collision with root package name */
    public Button f12294b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f12295c1;

    /* renamed from: d1, reason: collision with root package name */
    public CharSequence f12296d1;

    /* renamed from: e1, reason: collision with root package name */
    public CharSequence f12297e1;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends d0<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.d0
        public final void a(S s) {
            v vVar = v.this;
            String strB = vVar.E().b();
            TextView textView = vVar.Y0;
            d<S> dVarE = vVar.E();
            vVar.y();
            textView.setContentDescription(dVarE.h());
            vVar.Y0.setText(strB);
            vVar.f12294b1.setEnabled(vVar.E().g());
        }
    }

    public static int F(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarD = i0.d();
        calendarD.set(5, 1);
        Calendar calendarC = i0.c(calendarD);
        calendarC.get(2);
        calendarC.get(1);
        int maximum = calendarC.getMaximum(7);
        calendarC.getActualMaximum(5);
        calendarC.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean G(Context context, int i6) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(q4.b.c(context, j.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i6});
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z6;
    }

    @Override // androidx.fragment.app.j
    public final Dialog D() {
        Context contextY = y();
        y();
        int iE = this.F0;
        if (iE == 0) {
            iE = E().e();
        }
        Dialog dialog = new Dialog(contextY, iE);
        Context context = dialog.getContext();
        this.N0 = G(context, android.R.attr.windowFullscreen);
        this.f12293a1 = new u4.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, w3.a.f15075p, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f12293a1.n(context);
        this.f12293a1.r(ColorStateList.valueOf(color));
        this.f12293a1.q(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final d<S> E() {
        if (this.G0 == null) {
            this.G0 = (d) this.f1197x.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.G0;
    }

    public final void H() {
        y();
        int iE = this.F0;
        if (iE == 0) {
            iE = E().e();
        }
        String str = this.O0 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        androidx.fragment.app.k kVarC = c().C(str);
        e0<S> e0Var = kVarC instanceof e0 ? (e0) kVarC : null;
        if (e0Var == null) {
            if (this.O0 == 1) {
                d<S> dVarE = E();
                com.google.android.material.datepicker.a aVar = this.I0;
                x xVar = new x();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", iE);
                bundle.putParcelable("DATE_SELECTOR_KEY", dVarE);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
                xVar.B(bundle);
                e0Var = xVar;
            } else {
                d<S> dVarE2 = E();
                com.google.android.material.datepicker.a aVar2 = this.I0;
                f fVar = this.J0;
                j<S> jVar = new j<>();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", iE);
                bundle2.putParcelable("GRID_SELECTOR_KEY", dVarE2);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", fVar);
                bundle2.putParcelable("CURRENT_MONTH_KEY", aVar2.f12222v);
                jVar.B(bundle2);
                this.K0 = jVar;
                e0Var = jVar;
            }
        }
        this.H0 = e0Var;
        e0Var.C(new a());
        this.X0.setText((this.O0 == 1 && y().getResources().getConfiguration().orientation == 2) ? this.f12297e1 : this.f12296d1);
        String strB = E().b();
        TextView textView = this.Y0;
        d<S> dVarE3 = E();
        y();
        textView.setContentDescription(dVarE3.h());
        this.Y0.setText(strB);
        androidx.fragment.app.y yVarC = c();
        yVarC.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(yVarC);
        aVar3.e(R.id.mtrl_calendar_frame, this.H0, str, 2);
        if (aVar3.f1115g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar3.f1058p.z(aVar3, false);
    }

    public final void I(CheckableImageButton checkableImageButton) {
        this.Z0.setContentDescription(this.O0 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public final void J(CheckableImageButton checkableImageButton) {
        e1.a(this.Z0, this.O0 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.k
    public final void o(Bundle bundle) throws Resources.NotFoundException {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f1197x;
        }
        this.F0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.G0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.I0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.J0 = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.L0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.O0 = bundle.getInt("INPUT_MODE_KEY");
        this.P0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Q0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.R0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.S0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.T0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.U0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.V0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.W0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.M0;
        if (text == null) {
            text = y().getResources().getText(this.L0);
        }
        this.f12296d1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f12297e1 = text;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.D0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.E0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.W;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.k
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.N0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.N0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(F(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(F(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.Y0 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.Z0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.X0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.Z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.Z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, y5.b0.d(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], y5.b0.d(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.Z0.setChecked(this.O0 != 0);
        u0.f0.m(this.Z0, null);
        I(this.Z0);
        J(this.Z0);
        this.Z0.setOnClickListener(new t(0, this));
        this.f12294b1 = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (E().g()) {
            this.f12294b1.setEnabled(true);
        } else {
            this.f12294b1.setEnabled(false);
        }
        this.f12294b1.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.Q0;
        if (charSequence != null) {
            this.f12294b1.setText(charSequence);
        } else {
            int i6 = this.P0;
            if (i6 != 0) {
                this.f12294b1.setText(i6);
            }
        }
        CharSequence charSequence2 = this.S0;
        if (charSequence2 != null) {
            this.f12294b1.setContentDescription(charSequence2);
        } else if (this.R0 != 0) {
            this.f12294b1.setContentDescription(d().getResources().getText(this.R0));
        }
        this.f12294b1.setOnClickListener(new r(0, this));
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.U0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i7 = this.T0;
            if (i7 != 0) {
                button.setText(i7);
            }
        }
        CharSequence charSequence4 = this.W0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.V0 != 0) {
            button.setContentDescription(d().getResources().getText(this.V0));
        }
        button.setOnClickListener(new s(0, this));
        return viewInflate;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.k
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.F0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.G0);
        com.google.android.material.datepicker.a aVar = this.I0;
        a.b bVar = new a.b();
        int i6 = a.b.f12226c;
        int i7 = a.b.f12226c;
        bVar.f12228b = new e(Long.MIN_VALUE);
        long j6 = aVar.s.f12307x;
        long j7 = aVar.f12220t.f12307x;
        bVar.f12227a = Long.valueOf(aVar.f12222v.f12307x);
        int i8 = aVar.f12223w;
        a.c cVar = aVar.f12221u;
        bVar.f12228b = cVar;
        j<S> jVar = this.K0;
        y yVar = jVar == null ? null : jVar.f12263q0;
        if (yVar != null) {
            bVar.f12227a = Long.valueOf(yVar.f12307x);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar);
        y yVarM = y.m(j6);
        y yVarM2 = y.m(j7);
        a.c cVar2 = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = bVar.f12227a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.a(yVarM, yVarM2, cVar2, l4 == null ? null : y.m(l4.longValue()), i8));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.J0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.L0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.M0);
        bundle.putInt("INPUT_MODE_KEY", this.O0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.P0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.Q0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.R0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.S0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.T0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.U0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.V0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.W0);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.k
    public final void u() throws Resources.NotFoundException {
        int iE;
        super.u();
        Dialog dialog = this.f1154w0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.N0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f12293a1);
            if (!this.f12295c1) {
                View viewFindViewById = z().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListA = i4.a.a(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
                boolean z6 = false;
                boolean z7 = numValueOf == null || numValueOf.intValue() == 0;
                Integer numG = androidx.work.j.g(window.getContext(), android.R.attr.colorBackground);
                int iIntValue = numG != null ? numG.intValue() : -16777216;
                if (z7) {
                    numValueOf = Integer.valueOf(iIntValue);
                }
                q0.a(window, false);
                window.getContext();
                Context context = window.getContext();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 27) {
                    Integer numG2 = androidx.work.j.g(context, android.R.attr.navigationBarColor);
                    iE = m0.a.e(numG2 != null ? numG2.intValue() : -16777216, 128);
                } else {
                    iE = 0;
                }
                if (i6 < 35) {
                    window.setStatusBarColor(0);
                }
                if (i6 < 35) {
                    window.setNavigationBarColor(iE);
                }
                int iIntValue2 = numValueOf.intValue();
                boolean z8 = iIntValue2 != 0 && m0.a.b(iIntValue2) > 0.5d;
                u0.w wVar = new u0.w(window.getDecorView());
                int i7 = Build.VERSION.SDK_INT;
                (i7 >= 35 ? new x0(window, wVar) : i7 >= 30 ? new w0(window, wVar) : i7 >= 26 ? new v0(window, wVar) : new u0(window, wVar)).l(z8);
                boolean z9 = iIntValue != 0 && m0.a.b(iIntValue) > 0.5d;
                if ((iE != 0 && m0.a.b(iE) > 0.5d) || (iE == 0 && z9)) {
                    z6 = true;
                }
                u0.w wVar2 = new u0.w(window.getDecorView());
                int i8 = Build.VERSION.SDK_INT;
                (i8 >= 35 ? new x0(window, wVar2) : i8 >= 30 ? new w0(window, wVar2) : i8 >= 26 ? new v0(window, wVar2) : new u0(window, wVar2)).k(z6);
                u uVar = new u(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
                f0.d.k(viewFindViewById, uVar);
                this.f12295c1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = y().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f12293a1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1154w0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new h4.a(dialog2, rect));
        }
        H();
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.k
    public final void v() {
        this.H0.f12253l0.clear();
        super.v();
    }
}
