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
import com.basitce.htmltoapk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class SearchView extends androidx.appcompat.widget.c {

    /* renamed from: x, reason: collision with root package name */
    public static final e f643x;

    /* renamed from: r, reason: collision with root package name */
    public boolean f644r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f645s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f646t;

    /* renamed from: v, reason: collision with root package name */
    public int f647v;

    /* renamed from: w, reason: collision with root package name */
    public SearchableInfo f648w;

    public static class SearchAutoComplete extends m.c {

        /* renamed from: e, reason: collision with root package name */
        public int f649e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f650f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f651g;

        /* renamed from: h, reason: collision with root package name */
        public final a f652h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f651g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f651g = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f649e <= 0 || super.enoughToFilter();
        }

        @Override // m.c, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f651g) {
                a aVar = this.f652h;
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
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f650f;
            searchView.f645s = searchView.f645s;
            throw null;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
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
                        this.f650f.clearFocus();
                        throw null;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f650f.hasFocus() && getVisibility() == 0) {
                this.f651g = true;
                if (getContext().getResources().getConfiguration().orientation == 2) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        a.b(this, 1);
                        if (enoughToFilter()) {
                            showDropDown();
                            return;
                        }
                        return;
                    }
                    e eVar = SearchView.f643x;
                    eVar.getClass();
                    e.a();
                    Method method = eVar.f654a;
                    if (method != null) {
                        try {
                            method.invoke(this, Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.f652h;
            if (!z10) {
                this.f651g = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f651g = true;
                    return;
                }
                this.f651g = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f650f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f649e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f652h = new a();
            this.f649e = getThreshold();
        }
    }

    public static class a {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public Method f654a;

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class f extends q4.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f655c;

        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new f[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f655c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f655c + "}";
        }

        @Override // q4.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f655c));
        }
    }

    static {
        e eVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            e eVar2 = new e();
            eVar2.f654a = null;
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
                eVar2.f654a = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            eVar = eVar2;
        }
        f643x = eVar;
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
        return this.f647v;
    }

    public CharSequence getQuery() {
        throw null;
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f646t;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f648w;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return null;
        }
        return getContext().getText(this.f648w.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return 0;
    }

    public int getSuggestionRowLayout() {
        return 0;
    }

    public o4.a getSuggestionsAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        post(null);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.c, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f645s) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f647v;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f647v;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f647v) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
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
        super.onRestoreInstanceState(fVar.f21914a);
        this.f645s = fVar.f655c;
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f655c = this.f645s;
        return fVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
    }

    public void setIconified(boolean z10) {
        if (z10) {
            throw null;
        }
        this.f645s = false;
        throw null;
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f644r == z10) {
            return;
        }
        this.f644r = z10;
        this.f645s = z10;
        throw null;
    }

    public void setImeOptions(int i10) {
        throw null;
    }

    public void setInputType(int i10) {
        throw null;
    }

    public void setMaxWidth(int i10) {
        this.f647v = i10;
        requestLayout();
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

    public void setQueryHint(CharSequence charSequence) {
        this.f646t = charSequence;
        getQueryHint();
        throw null;
    }

    public void setQueryRefinementEnabled(boolean z10) {
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f648w = searchableInfo;
        if (searchableInfo != null) {
            searchableInfo.getSuggestThreshold();
            throw null;
        }
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled() && !this.f648w.getVoiceSearchLaunchWebSearch()) {
            this.f648w.getVoiceSearchLaunchRecognizer();
        }
        this.f645s = this.f645s;
        throw null;
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f645s = this.f645s;
        throw null;
    }

    public void setSuggestionsAdapter(o4.a aVar) {
        throw null;
    }
}
