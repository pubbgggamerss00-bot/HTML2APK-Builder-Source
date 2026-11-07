package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.p;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.dn;
import com.google.android.material.chip.a;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import l.f;
import n4.h;
import n4.j;
import q4.c;
import q4.d;
import s0.c;
import u0.f0;
import u4.k;
import u4.o;
import v0.b;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class Chip extends f implements a.InterfaceC0035a, o, Checkable {
    public static final Rect O = new Rect();
    public static final int[] P = {R.attr.state_selected};
    public static final int[] Q = {R.attr.state_checkable};
    public CompoundButton.OnCheckedChangeListener A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public CharSequence I;
    public final b J;
    public boolean K;
    public final Rect L;
    public final RectF M;
    public final a N;

    /* renamed from: w, reason: collision with root package name */
    public com.google.android.material.chip.a f12179w;

    /* renamed from: x, reason: collision with root package name */
    public InsetDrawable f12180x;

    /* renamed from: y, reason: collision with root package name */
    public RippleDrawable f12181y;

    /* renamed from: z, reason: collision with root package name */
    public View.OnClickListener f12182z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends c1.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // c1.a
        public final void l(ArrayList arrayList) {
            com.google.android.material.chip.a aVar;
            arrayList.add(0);
            Rect rect = Chip.O;
            Chip chip = Chip.this;
            if (!chip.d() || (aVar = chip.f12179w) == null || !aVar.f12205m0 || chip.f12182z == null) {
                return;
            }
            arrayList.add(1);
        }

        @Override // c1.a
        public final void o(int i6, v0.b bVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
            CharSequence charSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (i6 != 1) {
                accessibilityNodeInfo.setContentDescription(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                accessibilityNodeInfo.setBoundsInParent(Chip.O);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(com.htmltoapk.template.R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            bVar.b(b.a.f14731e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            bVar.h(Button.class.getName());
        }

        @Override // c1.a
        public final void p(int i6, boolean z6) {
            Chip chip = Chip.this;
            if (i6 == 1) {
                chip.E = z6;
            }
            com.google.android.material.chip.a aVar = chip.f12179w;
            boolean z7 = chip.E;
            boolean zV = false;
            if (aVar.f12206n0 != null) {
                zV = aVar.V(z7 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : com.google.android.material.chip.a.f12184h1);
            }
            if (zV) {
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a5.a.b(context, attributeSet, com.htmltoapk.template.R.attr.chipStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.htmltoapk.template.R.attr.chipStyle);
        this.L = new Rect();
        this.M = new RectF();
        this.N = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet);
        Context context3 = aVar.G0;
        int[] iArr = w3.a.f15064d;
        TypedArray typedArrayD = j.d(context3, attributeSet, iArr, com.htmltoapk.template.R.attr.chipStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        aVar.f12199g1 = typedArrayD.hasValue(39);
        Context context4 = aVar.G0;
        ColorStateList colorStateListA = c.a(context4, typedArrayD, 25);
        if (aVar.Z != colorStateListA) {
            aVar.Z = colorStateListA;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList colorStateListA2 = c.a(context4, typedArrayD, 12);
        if (aVar.f12186a0 != colorStateListA2) {
            aVar.f12186a0 = colorStateListA2;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = typedArrayD.getDimension(20, 0.0f);
        if (aVar.f12188b0 != dimension) {
            aVar.f12188b0 = dimension;
            aVar.invalidateSelf();
            aVar.E();
        }
        if (typedArrayD.hasValue(13)) {
            aVar.K(typedArrayD.getDimension(13, 0.0f));
        }
        aVar.P(c.a(context4, typedArrayD, 23));
        aVar.Q(typedArrayD.getDimension(24, 0.0f));
        aVar.a0(c.a(context4, typedArrayD, 38));
        CharSequence text = typedArrayD.getText(5);
        text = text == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : text;
        if (!TextUtils.equals(aVar.f12198g0, text)) {
            aVar.f12198g0 = text;
            aVar.M0.f13987d = true;
            aVar.invalidateSelf();
            aVar.E();
        }
        d dVar = (!typedArrayD.hasValue(0) || (resourceId3 = typedArrayD.getResourceId(0, 0)) == 0) ? null : new d(context4, resourceId3);
        dVar.f14206l = typedArrayD.getDimension(1, dVar.f14206l);
        if (Build.VERSION.SDK_INT >= 26) {
            int i6 = typedArrayD.hasValue(34) ? 34 : 7;
            if (typedArrayD.hasValue(i6)) {
                dVar.f14198c = typedArrayD.getString(i6);
            }
        }
        aVar.b0(dVar);
        int i7 = typedArrayD.getInt(3, 0);
        if (i7 == 1) {
            aVar.f12193d1 = TextUtils.TruncateAt.START;
        } else if (i7 == 2) {
            aVar.f12193d1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i7 == 3) {
            aVar.f12193d1 = TextUtils.TruncateAt.END;
        }
        aVar.O(typedArrayD.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.O(typedArrayD.getBoolean(16, false));
        }
        aVar.L(c.c(context4, typedArrayD, 15));
        if (typedArrayD.hasValue(18)) {
            aVar.N(c.a(context4, typedArrayD, 18));
        }
        aVar.M(typedArrayD.getDimension(17, -1.0f));
        aVar.X(typedArrayD.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.X(typedArrayD.getBoolean(27, false));
        }
        aVar.R(c.c(context4, typedArrayD, 26));
        aVar.W(c.a(context4, typedArrayD, 31));
        aVar.T(typedArrayD.getDimension(29, 0.0f));
        aVar.G(typedArrayD.getBoolean(6, false));
        aVar.J(typedArrayD.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.J(typedArrayD.getBoolean(9, false));
        }
        aVar.H(c.c(context4, typedArrayD, 8));
        if (typedArrayD.hasValue(10)) {
            aVar.I(c.a(context4, typedArrayD, 10));
        }
        aVar.f12214w0 = (!typedArrayD.hasValue(41) || (resourceId2 = typedArrayD.getResourceId(41, 0)) == 0) ? null : x3.b.a(context4, resourceId2);
        aVar.f12215x0 = (!typedArrayD.hasValue(35) || (resourceId = typedArrayD.getResourceId(35, 0)) == 0) ? null : x3.b.a(context4, resourceId);
        float dimension2 = typedArrayD.getDimension(22, 0.0f);
        if (aVar.f12216y0 != dimension2) {
            aVar.f12216y0 = dimension2;
            aVar.invalidateSelf();
            aVar.E();
        }
        aVar.Z(typedArrayD.getDimension(37, 0.0f));
        aVar.Y(typedArrayD.getDimension(36, 0.0f));
        float dimension3 = typedArrayD.getDimension(43, 0.0f);
        if (aVar.B0 != dimension3) {
            aVar.B0 = dimension3;
            aVar.invalidateSelf();
            aVar.E();
        }
        float dimension4 = typedArrayD.getDimension(42, 0.0f);
        if (aVar.C0 != dimension4) {
            aVar.C0 = dimension4;
            aVar.invalidateSelf();
            aVar.E();
        }
        aVar.U(typedArrayD.getDimension(30, 0.0f));
        aVar.S(typedArrayD.getDimension(28, 0.0f));
        float dimension5 = typedArrayD.getDimension(14, 0.0f);
        if (aVar.F0 != dimension5) {
            aVar.F0 = dimension5;
            aVar.invalidateSelf();
            aVar.E();
        }
        aVar.f12197f1 = typedArrayD.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayD.recycle();
        j.a(context2, attributeSet, com.htmltoapk.template.R.attr.chipStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Chip_Action);
        j.b(context2, attributeSet, iArr, com.htmltoapk.template.R.attr.chipStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.htmltoapk.template.R.attr.chipStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Chip_Action);
        this.F = typedArrayObtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue typedValueA = q4.b.a(theme, com.htmltoapk.template.R.attr.minTouchTargetSize);
        this.H = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(21, (int) (Float.isNaN((typedValueA == null || typedValueA.type != 5) ? Float.NaN : typedValueA.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.htmltoapk.template.R.dimen.mtrl_min_touch_target_size) : r6)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(aVar);
        aVar.q(getElevation());
        j.a(context2, attributeSet, com.htmltoapk.template.R.attr.chipStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Chip_Action);
        j.b(context2, attributeSet, iArr, com.htmltoapk.template.R.attr.chipStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.htmltoapk.template.R.attr.chipStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(39);
        typedArrayObtainStyledAttributes2.recycle();
        this.J = new b(this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new f4.b(this));
        }
        setChecked(this.B);
        setText(aVar.f12198g0);
        setEllipsize(aVar.f12193d1);
        h();
        if (!this.f12179w.f12195e1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.F) {
            setMinHeight(this.H);
        }
        this.G = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f4.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f13059a.A;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z6);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.M;
        rectF.setEmpty();
        if (d() && this.f12182z != null) {
            com.google.android.material.chip.a aVar = this.f12179w;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.e0()) {
                float f6 = aVar.F0 + aVar.E0 + aVar.f12208q0 + aVar.D0 + aVar.C0;
                if (aVar.getLayoutDirection() == 0) {
                    float f7 = bounds.right;
                    rectF.right = f7;
                    rectF.left = f7 - f6;
                } else {
                    float f8 = bounds.left;
                    rectF.left = f8;
                    rectF.right = f8 + f6;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i6 = (int) closeIconTouchBounds.left;
        int i7 = (int) closeIconTouchBounds.top;
        int i8 = (int) closeIconTouchBounds.right;
        int i9 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.L;
        rect.set(i6, i7, i8, i9);
        return rect;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.M0.f13989f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z6) {
        if (this.D != z6) {
            this.D = z6;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z6) {
        if (this.C != z6) {
            this.C = z6;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0035a
    public final void a() {
        c(this.H);
        requestLayout();
        invalidateOutline();
    }

    public final void c(int i6) {
        this.H = i6;
        if (!this.F) {
            InsetDrawable insetDrawable = this.f12180x;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f12180x = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i6 - ((int) this.f12179w.f12188b0));
        int iMax2 = Math.max(0, i6 - this.f12179w.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f12180x;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f12180x = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i7 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i8 = iMax > 0 ? iMax / 2 : 0;
        if (this.f12180x != null) {
            Rect rect = new Rect();
            this.f12180x.getPadding(rect);
            if (rect.top == i8 && rect.bottom == i8 && rect.left == i7 && rect.right == i7) {
                f();
                return;
            }
        }
        if (getMinHeight() != i6) {
            setMinHeight(i6);
        }
        if (getMinWidth() != i6) {
            setMinWidth(i6);
        }
        this.f12180x = new InsetDrawable((Drawable) this.f12179w, i7, i8, i7, i8);
        f();
    }

    public final boolean d() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null) {
            return false;
        }
        Object objB = aVar.f12206n0;
        if (objB == null) {
            objB = null;
        } else if (objB instanceof n0.b) {
            objB = ((n0.b) objB).b();
        }
        return objB != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i6;
        if (!this.K) {
            return super.dispatchHoverEvent(motionEvent);
        }
        b bVar = this.J;
        AccessibilityManager accessibilityManager = bVar.h;
        int i7 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x6 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = Chip.this;
                if (chip.d() && chip.getCloseIconTouchBounds().contains(x6, y2)) {
                    i7 = 1;
                }
                int i8 = bVar.f2133m;
                if (i8 != i7) {
                    bVar.f2133m = i7;
                    bVar.r(i7, 128);
                    bVar.r(i8, 256);
                    return true;
                }
            } else if (action == 10 && (i6 = bVar.f2133m) != Integer.MIN_VALUE) {
                if (i6 != Integer.MIN_VALUE) {
                    bVar.f2133m = Integer.MIN_VALUE;
                    bVar.r(Integer.MIN_VALUE, 128);
                    bVar.r(i6, 256);
                    return true;
                }
            }
        } else if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.K) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.J;
        bVar.getClass();
        boolean zM = false;
        int i6 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i7 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case dn.zzm /* 21 */:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i7 = 33;
                                } else if (keyCode == 21) {
                                    i7 = 17;
                                } else if (keyCode != 22) {
                                    i7 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z6 = false;
                                while (i6 < repeatCount && bVar.m(i7, null)) {
                                    i6++;
                                    z6 = true;
                                }
                                zM = z6;
                                break;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                int i8 = bVar.f2132l;
                                if (i8 != Integer.MIN_VALUE) {
                                    Chip chip = Chip.this;
                                    if (i8 == 0) {
                                        chip.performClick();
                                    } else if (i8 == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f12182z;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.K) {
                                            chip.J.r(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                                break;
                            }
                            break;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = bVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = bVar.m(1, null);
            }
        }
        if (!zM || bVar.f2132l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f12179w;
        boolean zV = false;
        int i6 = 0;
        zV = false;
        if (aVar != null && com.google.android.material.chip.a.D(aVar.f12206n0)) {
            com.google.android.material.chip.a aVar2 = this.f12179w;
            ?? IsEnabled = isEnabled();
            int i7 = IsEnabled;
            if (this.E) {
                i7 = IsEnabled + 1;
            }
            int i8 = i7;
            if (this.D) {
                i8 = i7 + 1;
            }
            int i9 = i8;
            if (this.C) {
                i9 = i8 + 1;
            }
            int i10 = i9;
            if (isChecked()) {
                i10 = i9 + 1;
            }
            int[] iArr = new int[i10];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i6 = 1;
            }
            if (this.E) {
                iArr[i6] = 16842908;
                i6++;
            }
            if (this.D) {
                iArr[i6] = 16843623;
                i6++;
            }
            if (this.C) {
                iArr[i6] = 16842919;
                i6++;
            }
            if (isChecked()) {
                iArr[i6] = 16842913;
            }
            zV = aVar2.V(iArr);
        }
        if (zV) {
            invalidate();
        }
    }

    public final void e() {
        com.google.android.material.chip.a aVar;
        if (!d() || (aVar = this.f12179w) == null || !aVar.f12205m0 || this.f12182z == null) {
            f0.m(this, null);
            this.K = false;
        } else {
            f0.m(this, this.J);
            this.K = true;
        }
    }

    public final void f() {
        RippleDrawable rippleDrawable = new RippleDrawable(r4.a.a(this.f12179w.f12196f0), getBackgroundDrawable(), null);
        FocusRingDrawable.e(getContext(), rippleDrawable, this.f12179w);
        this.f12181y = rippleDrawable;
        this.f12179w.getClass();
        setBackground(this.f12181y);
        g();
    }

    public final void g() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f12179w) == null) {
            return;
        }
        int iA = (int) (aVar.A() + aVar.F0 + aVar.C0);
        com.google.android.material.chip.a aVar2 = this.f12179w;
        int iZ = (int) (aVar2.z() + aVar2.f12216y0 + aVar2.B0);
        if (this.f12180x != null) {
            Rect rect = new Rect();
            this.f12180x.getPadding(rect);
            iZ += rect.left;
            iA += rect.right;
        }
        setPaddingRelative(iZ, getPaddingTop(), iA, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.I)) {
            return this.I;
        }
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || !aVar.f12210s0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        if (getParent() instanceof f4.c) {
            throw null;
        }
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f12180x;
        return insetDrawable == null ? this.f12179w : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12212u0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12213v0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12186a0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return Math.max(0.0f, aVar.B());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f12179w;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.F0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || (drawable = aVar.f12201i0) == 0) {
            return null;
        }
        return drawable instanceof n0.b ? ((n0.b) drawable).b() : drawable;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12203k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12202j0;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12188b0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12216y0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12192d0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12194e0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || (drawable = aVar.f12206n0) == 0) {
            return null;
        }
        return drawable instanceof n0.b ? ((n0.b) drawable).b() : drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12209r0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.E0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12208q0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.D0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.p0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12193d1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.K) {
            b bVar = this.J;
            if (bVar.f2132l == 1 || bVar.f2131k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null) {
            return super.getFontVariationSettings();
        }
        d dVar = aVar.M0.f13989f;
        if (dVar == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return dVar.f14198c;
    }

    public x3.b getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12215x0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.A0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12217z0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12196f0;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f12179w.j();
    }

    public x3.b getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.f12214w0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.C0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            return aVar.B0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.N);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a1.a.g(this, this.f12179w);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, P);
        }
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null && aVar.f12210s0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i6, Rect rect) {
        super.onFocusChanged(z6, i6, rect);
        if (this.K) {
            b bVar = this.J;
            int i7 = bVar.f2132l;
            if (i7 != Integer.MIN_VALUE) {
                bVar.j(i7);
            }
            if (z6) {
                bVar.m(i6, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i6;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.f12179w;
        int i7 = 0;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.f12210s0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof f4.c) {
            f4.c cVar = (f4.c) getParent();
            if (cVar.f13970u) {
                int i8 = 0;
                while (true) {
                    if (i7 >= cVar.getChildCount()) {
                        i8 = -1;
                        break;
                    }
                    View childAt = cVar.getChildAt(i7);
                    if ((childAt instanceof Chip) && cVar.getChildAt(i7).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    i7++;
                }
                i6 = i8;
            } else {
                i6 = -1;
            }
            Object tag = getTag(com.htmltoapk.template.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i6, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i6) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i6);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        if (this.G != i6) {
            this.G = i6;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.C) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z6 = true;
                    }
                }
                z6 = false;
            } else {
                if (this.C) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f12182z;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.K) {
                        this.J.r(1, 1);
                    }
                    z6 = true;
                }
                setCloseIconPressed(false);
            }
            z6 = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z6 = true;
            }
            z6 = false;
        }
        return z6 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.I = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12181y) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12181y) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.f, android.view.View
    public void setBackgroundResource(int i6) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.G(z6);
        }
    }

    public void setCheckableResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.G(aVar.G0.getResources().getBoolean(i6));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null) {
            this.B = z6;
        } else if (aVar.f12210s0) {
            super.setChecked(z6);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.H(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z6) {
        setCheckedIconVisible(z6);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i6) {
        setCheckedIconVisible(i6);
    }

    public void setCheckedIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.H(b0.d(aVar.G0, i6));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.I(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.I(k0.a.b(aVar.G0, i6));
        }
    }

    public void setCheckedIconVisible(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.J(aVar.G0.getResources().getBoolean(i6));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || aVar.f12186a0 == colorStateList) {
            return;
        }
        aVar.f12186a0 = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i6) {
        ColorStateList colorStateListB;
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || aVar.f12186a0 == (colorStateListB = k0.a.b(aVar.G0, i6))) {
            return;
        }
        aVar.f12186a0 = colorStateListB;
        aVar.onStateChange(aVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.K(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.K(aVar.G0.getResources().getDimension(i6));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f12179w;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.f12191c1 = new WeakReference<>(null);
            }
            this.f12179w = aVar;
            aVar.f12195e1 = false;
            aVar.f12191c1 = new WeakReference<>(this);
            c(this.H);
        }
    }

    public void setChipEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || aVar.F0 == f6) {
            return;
        }
        aVar.F0 = f6;
        aVar.invalidateSelf();
        aVar.E();
    }

    public void setChipEndPaddingResource(int i6) throws Resources.NotFoundException {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            float dimension = aVar.G0.getResources().getDimension(i6);
            if (aVar.F0 != dimension) {
                aVar.F0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.L(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z6) {
        setChipIconVisible(z6);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i6) {
        setChipIconVisible(i6);
    }

    public void setChipIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.L(b0.d(aVar.G0, i6));
        }
    }

    public void setChipIconSize(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.M(f6);
        }
    }

    public void setChipIconSizeResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.M(aVar.G0.getResources().getDimension(i6));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.N(colorStateList);
        }
    }

    public void setChipIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.N(k0.a.b(aVar.G0, i6));
        }
    }

    public void setChipIconVisible(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.O(aVar.G0.getResources().getBoolean(i6));
        }
    }

    public void setChipMinHeight(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || aVar.f12188b0 == f6) {
            return;
        }
        aVar.f12188b0 = f6;
        aVar.invalidateSelf();
        aVar.E();
    }

    public void setChipMinHeightResource(int i6) throws Resources.NotFoundException {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            float dimension = aVar.G0.getResources().getDimension(i6);
            if (aVar.f12188b0 != dimension) {
                aVar.f12188b0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setChipStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || aVar.f12216y0 == f6) {
            return;
        }
        aVar.f12216y0 = f6;
        aVar.invalidateSelf();
        aVar.E();
    }

    public void setChipStartPaddingResource(int i6) throws Resources.NotFoundException {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            float dimension = aVar.G0.getResources().getDimension(i6);
            if (aVar.f12216y0 != dimension) {
                aVar.f12216y0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.P(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.P(k0.a.b(aVar.G0, i6));
        }
    }

    public void setChipStrokeWidth(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.Q(f6);
        }
    }

    public void setChipStrokeWidthResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.Q(aVar.G0.getResources().getDimension(i6));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i6) {
        setText(getResources().getString(i6));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.R(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || aVar.f12209r0 == charSequence) {
            return;
        }
        String str = s0.a.f14311b;
        s0.a aVar2 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? s0.a.f14314e : s0.a.f14313d;
        aVar2.getClass();
        c.d dVar = s0.c.f14325a;
        aVar.f12209r0 = aVar2.c(charSequence);
        aVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z6) {
        setCloseIconVisible(z6);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i6) {
        setCloseIconVisible(i6);
    }

    public void setCloseIconEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.S(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.S(aVar.G0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.R(b0.d(aVar.G0, i6));
        }
        e();
    }

    public void setCloseIconSize(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.T(f6);
        }
    }

    public void setCloseIconSizeResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.T(aVar.G0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.U(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.U(aVar.G0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.W(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.W(k0.a.b(aVar.G0, i6));
        }
    }

    public void setCloseIconVisible(int i6) {
        setCloseIconVisible(getResources().getBoolean(i6));
    }

    @Override // l.f, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.f, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i6, i7, i8, i9);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i6, i7, i8, i9);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.q(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f12179w == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.f12193d1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        this.F = z6;
        c(this.H);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null) {
            return false;
        }
        d dVar = aVar.M0.f13989f;
        if (dVar != null && Build.VERSION.SDK_INT >= 26) {
            dVar.f14198c = str;
        }
        h();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i6) {
        if (i6 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i6);
        }
    }

    public void setHideMotionSpec(x3.b bVar) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.f12215x0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.f12215x0 = x3.b.a(aVar.G0, i6);
        }
    }

    public void setIconEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.Y(f6);
        }
    }

    public void setIconEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.Y(aVar.G0.getResources().getDimension(i6));
        }
    }

    public void setIconStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.Z(f6);
        }
    }

    public void setIconStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.Z(aVar.G0.getResources().getDimension(i6));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
        if (this.f12179w == null) {
            return;
        }
        super.setLayoutDirection(i6);
    }

    @Override // android.widget.TextView
    public void setLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i6);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i6);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i6) {
        super.setMaxWidth(i6);
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.f12197f1 = i6;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i6);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f12182z = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.a0(colorStateList);
        }
        this.f12179w.getClass();
        f();
    }

    public void setRippleColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.a0(k0.a.b(aVar.G0, i6));
            this.f12179w.getClass();
            f();
        }
    }

    @Override // u4.o
    public void setShapeAppearanceModel(k kVar) {
        this.f12179w.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(x3.b bVar) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.f12214w0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.f12214w0 = x3.b.a(aVar.G0, i6);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z6) {
        if (!z6) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z6);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        super.setText(aVar.f12195e1 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f12179w;
        if (aVar2 == null || TextUtils.equals(aVar2.f12198g0, charSequence)) {
            return;
        }
        aVar2.f12198g0 = charSequence;
        aVar2.M0.f13987d = true;
        aVar2.invalidateSelf();
        aVar2.E();
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.b0(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i6) {
        setTextAppearance(getContext(), i6);
    }

    public void setTextEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || aVar.C0 == f6) {
            return;
        }
        aVar.C0 = f6;
        aVar.invalidateSelf();
        aVar.E();
    }

    public void setTextEndPaddingResource(int i6) throws Resources.NotFoundException {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            float dimension = aVar.G0.getResources().getDimension(i6);
            if (aVar.C0 != dimension) {
                aVar.C0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f6) {
        super.setTextSize(i6, f6);
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i6, f6, getResources().getDisplayMetrics());
            h hVar = aVar.M0;
            d dVar = hVar.f13989f;
            if (dVar != null) {
                dVar.f14206l = fApplyDimension;
                hVar.f13984a.setTextSize(fApplyDimension);
                aVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar == null || aVar.B0 == f6) {
            return;
        }
        aVar.B0 = f6;
        aVar.invalidateSelf();
        aVar.E();
    }

    public void setTextStartPaddingResource(int i6) throws Resources.NotFoundException {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            float dimension = aVar.G0.getResources().getDimension(i6);
            if (aVar.B0 != dimension) {
                aVar.B0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setCloseIconVisible(boolean z6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.X(z6);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.J(z6);
        }
    }

    public void setChipIconVisible(boolean z6) {
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.O(z6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.b0(new d(aVar.G0, i6));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i6) {
        super.setTextAppearance(i6);
        com.google.android.material.chip.a aVar = this.f12179w;
        if (aVar != null) {
            aVar.b0(new d(aVar.G0, i6));
        }
        h();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends p {
        public a() {
        }

        @Override // androidx.fragment.app.p
        public final void f(Typeface typeface, boolean z6) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f12179w;
            chip.setText(aVar.f12195e1 ? aVar.f12198g0 : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }

        @Override // androidx.fragment.app.p
        public final void e(int i6) {
        }
    }

    public void setInternalOnCheckedChangeListener(n4.f<Chip> fVar) {
    }
}
