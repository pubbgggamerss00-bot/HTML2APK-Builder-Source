package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip s;

    /* renamed from: t, reason: collision with root package name */
    public final EditText f12501t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f12502u;

    /* renamed from: v, reason: collision with root package name */
    public String f12503v;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends n4.i {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (zIsEmpty) {
                chipTextInputComboView.f12503v = ChipTextInputComboView.a(chipTextInputComboView, "00");
                return;
            }
            String strA = ChipTextInputComboView.a(chipTextInputComboView, editable);
            if (TextUtils.isEmpty(strA)) {
                strA = ChipTextInputComboView.a(chipTextInputComboView, "00");
            }
            chipTextInputComboView.f12503v = strA;
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f12503v = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.s = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f12501t = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a());
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        this.f12502u = textView;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
        new com.google.android.material.timepicker.a(this);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.s.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f12501t.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z6) {
        Chip chip = this.s;
        chip.setChecked(z6);
        if (z6) {
            chip.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            chip.setImportantForAccessibility(2);
        } else {
            chip.setText(this.f12503v);
            chip.setImportantForAccessibility(1);
        }
        int i6 = z6 ? 0 : 4;
        EditText editText = this.f12501t;
        editText.setVisibility(i6);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new androidx.camera.lifecycle.a(4, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.s.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i6, Object obj) {
        this.s.setTag(i6, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.s.toggle();
    }
}
