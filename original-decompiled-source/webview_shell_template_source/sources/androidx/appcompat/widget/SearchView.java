package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import com.htmltoapk.template.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class SearchView extends androidx.appcompat.widget.b implements j.b {
    public static final e M;
    public boolean H;
    public boolean I;
    public CharSequence J;
    public int K;
    public SearchableInfo L;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i6) {
            searchAutoComplete.setInputMethodMode(i6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface d {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public Method f272a;

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class f extends b1.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public boolean f273u;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new f[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f273u = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f273u + "}";
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeValue(Boolean.valueOf(this.f273u));
        }
    }

    static {
        e eVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            e eVar2 = new e();
            eVar2.f272a = null;
            e.a();
            try {
                AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null).setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null).setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                eVar2.f272a = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            eVar = eVar2;
        }
        M = eVar;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        super.clearFocus();
        throw null;
    }

    public int getImeOptions() {
        throw null;
    }

    public int getInputType() {
        throw null;
    }

    public int getMaxWidth() {
        return this.K;
    }

    public CharSequence getQuery() {
        throw null;
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.J;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.L;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return null;
        }
        return getContext().getText(this.L.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return 0;
    }

    public int getSuggestionRowLayout() {
        return 0;
    }

    public z0.a getSuggestionsAdapter() {
        return null;
    }

    @Override // j.b
    public final void onActionViewCollapsed() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        post(null);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        if (z6) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        if (this.I) {
            super.onMeasure(i6, i7);
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (mode == Integer.MIN_VALUE) {
            int i9 = this.K;
            size = i9 > 0 ? Math.min(i9, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.K;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i8 = this.K) > 0) {
            size = Math.min(i8, size);
        }
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.s);
        this.I = fVar.f273u;
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f273u = this.I;
        return fVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        post(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i6, Rect rect) {
        return false;
    }

    public void setIconified(boolean z6) {
        if (z6) {
            throw null;
        }
        this.I = false;
        throw null;
    }

    public void setIconifiedByDefault(boolean z6) {
        if (this.H == z6) {
            return;
        }
        this.H = z6;
        this.I = z6;
        throw null;
    }

    public void setImeOptions(int i6) {
        throw null;
    }

    public void setInputType(int i6) {
        throw null;
    }

    public void setMaxWidth(int i6) {
        this.K = i6;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.J = charSequence;
        getQueryHint();
        throw null;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.L = searchableInfo;
        if (searchableInfo != null) {
            searchableInfo.getSuggestThreshold();
            throw null;
        }
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled() && !this.L.getVoiceSearchLaunchWebSearch()) {
            this.L.getVoiceSearchLaunchRecognizer();
        }
        this.I = this.I;
        throw null;
    }

    public void setSubmitButtonEnabled(boolean z6) {
        this.I = this.I;
        throw null;
    }

    public void setSuggestionsAdapter(z0.a aVar) {
        throw null;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class SearchAutoComplete extends l.c {

        /* renamed from: w, reason: collision with root package name */
        public int f268w;

        /* renamed from: x, reason: collision with root package name */
        public SearchView f269x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f270y;

        /* renamed from: z, reason: collision with root package name */
        public final a f271z;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f270y) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f270y = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.f271z = new a();
            this.f268w = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i6 = configuration.screenWidthDp;
            int i7 = configuration.screenHeightDp;
            if (i6 >= 960 && i7 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i6 < 600) {
                return (i6 < 640 || i7 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f268w <= 0 || super.enoughToFilter();
        }

        @Override // l.c, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f270y) {
                a aVar = this.f271z;
                removeCallbacks(aVar);
                post(aVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z6, int i6, Rect rect) {
            super.onFocusChanged(z6, i6, rect);
            SearchView searchView = this.f269x;
            searchView.I = searchView.I;
            throw null;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i6, KeyEvent keyEvent) {
            if (i6 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f269x.clearFocus();
                        throw null;
                    }
                }
            }
            return super.onKeyPreIme(i6, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z6) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z6);
            if (z6 && this.f269x.hasFocus() && getVisibility() == 0) {
                this.f270y = true;
                if (getContext().getResources().getConfiguration().orientation == 2) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        a.b(this, 1);
                        if (enoughToFilter()) {
                            showDropDown();
                            return;
                        }
                        return;
                    }
                    e eVar = SearchView.M;
                    eVar.getClass();
                    e.a();
                    Method method = eVar.f272a;
                    if (method != null) {
                        try {
                            method.invoke(this, Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        public void setImeVisibility(boolean z6) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.f271z;
            if (!z6) {
                this.f270y = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f270y = true;
                    return;
                }
                this.f270y = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f269x = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i6) {
            super.setThreshold(i6);
            this.f268w = i6;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    @Override // j.b
    public final void onActionViewExpanded() {
    }

    public void setAppSearchData(Bundle bundle) {
    }

    public void setOnCloseListener(b bVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setOnQueryTextListener(c cVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnSuggestionListener(d dVar) {
    }

    public void setQueryRefinementEnabled(boolean z6) {
    }
}
