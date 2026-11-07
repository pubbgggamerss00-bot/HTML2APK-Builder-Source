package y0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.work.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.c0;
import s0.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params b(c0 c0Var) {
            return c0Var.getTextMetricsParams();
        }

        public static void c(TextView textView, int i6) {
            textView.setFirstBaselineToTopHeight(i6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static void a(TextView textView, int i6, float f6) {
            textView.setLineHeight(i6, f6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c implements ActionMode.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f15212a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f15213b;

        /* renamed from: c, reason: collision with root package name */
        public Class<?> f15214c;

        /* renamed from: d, reason: collision with root package name */
        public Method f15215d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f15216e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f15217f = false;

        public c(ActionMode.Callback callback, TextView textView) {
            this.f15212a = callback;
            this.f15213b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f15212a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f15212a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f15212a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            String str;
            TextView textView = this.f15213b;
            Context context = textView.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z6 = this.f15217f;
            Class cls = Integer.TYPE;
            if (!z6) {
                this.f15217f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f15214c = cls2;
                    this.f15215d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f15216e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f15214c = null;
                    this.f15215d = null;
                    this.f15216e = false;
                }
            }
            try {
                Method declaredMethod = (this.f15216e && this.f15214c.isInstance(menu)) ? this.f15215d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                        if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            }
                        }
                        arrayList.add(resolveInfo);
                    }
                }
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i6);
                    MenuItem menuItemAdd = menu.add(0, 0, i6 + 100, resolveInfo2.loadLabel(packageManager));
                    Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f15212a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static b.a a(c0 c0Var) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            return new b.a(a.b(c0Var));
        }
        TextPaint textPaint = new TextPaint(c0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0Var.getBreakStrategy();
        int hyphenationFrequency = c0Var.getHyphenationFrequency();
        if (c0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i6 < 28 || (c0Var.getInputType() & 15) != 3) {
                boolean z6 = c0Var.getLayoutDirection() == 1;
                switch (c0Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z6) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(a.a(DecimalFormatSymbols.getInstance(c0Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new b.a(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void b(TextView textView, int i6) {
        j.d(i6);
        if (Build.VERSION.SDK_INT >= 28) {
            a.c(textView, i6);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i6 > Math.abs(i7)) {
            textView.setPadding(textView.getPaddingLeft(), i6 + i7, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i6) {
        j.d(i6);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i6 > Math.abs(i7)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i6 - i7);
        }
    }

    public static void d(TextView textView, int i6) {
        j.d(i6);
        if (i6 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i6 - r0, 1.0f);
        }
    }

    public static void e(c0 c0Var, s0.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            bVar.getClass();
            c0Var.setText((CharSequence) null);
        } else {
            b.a aVarA = a(c0Var);
            bVar.getClass();
            aVarA.a(null);
            throw null;
        }
    }

    public static ActionMode.Callback f(ActionMode.Callback callback) {
        return (!(callback instanceof c) || Build.VERSION.SDK_INT < 26) ? callback : ((c) callback).f15212a;
    }

    public static ActionMode.Callback g(ActionMode.Callback callback, TextView textView) {
        int i6 = Build.VERSION.SDK_INT;
        return (i6 < 26 || i6 > 27 || (callback instanceof c) || callback == null) ? callback : new c(callback, textView);
    }
}
