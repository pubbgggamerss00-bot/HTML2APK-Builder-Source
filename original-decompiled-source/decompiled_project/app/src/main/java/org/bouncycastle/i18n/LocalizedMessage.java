package org.bouncycastle.i18n;

import b.o;
import e.e;
import i8.n;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TimeZone;
import k3.b;
import org.bouncycastle.i18n.filter.Filter;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;

/* loaded from: classes2.dex */
public class LocalizedMessage {
    public static final String DEFAULT_ENCODING = "ISO-8859-1";
    protected FilteredArguments arguments;
    protected String encoding;
    protected FilteredArguments extraArgs;
    protected Filter filter;

    /* renamed from: id, reason: collision with root package name */
    protected final String f20110id;
    protected ClassLoader loader;
    protected final String resource;

    public static class FilteredArguments {
        protected static final int FILTER = 1;
        protected static final int FILTER_URL = 2;
        protected static final int NO_FILTER = 0;
        protected int[] argFilterType;
        protected Object[] arguments;
        protected Filter filter;
        protected Object[] filteredArgs;
        protected boolean[] isLocaleSpecific;
        protected Object[] unpackedArgs;

        public FilteredArguments() {
            this(new Object[0]);
        }

        private Object filter(int i10, Object obj) {
            Filter filter = this.filter;
            if (filter != null) {
                if (obj == null) {
                    obj = "null";
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        return filter.doFilter(obj.toString());
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return filter.doFilterUrl(obj.toString());
                }
            }
            return obj;
        }

        public Object[] getArguments() {
            return this.arguments;
        }

        public Filter getFilter() {
            return this.filter;
        }

        public Object[] getFilteredArgs(Locale locale) {
            Object[] objArr = new Object[this.unpackedArgs.length];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.unpackedArgs;
                if (i10 >= objArr2.length) {
                    return objArr;
                }
                Object objFilter = this.filteredArgs[i10];
                if (objFilter == null) {
                    Object obj = objArr2[i10];
                    if (this.isLocaleSpecific[i10]) {
                        objFilter = filter(this.argFilterType[i10], ((LocaleString) obj).getLocaleString(locale));
                    } else {
                        objFilter = filter(this.argFilterType[i10], obj);
                        this.filteredArgs[i10] = objFilter;
                    }
                }
                objArr[i10] = objFilter;
                i10++;
            }
        }

        public boolean isEmpty() {
            return this.unpackedArgs.length == 0;
        }

        public void setFilter(Filter filter) {
            if (filter != this.filter) {
                for (int i10 = 0; i10 < this.unpackedArgs.length; i10++) {
                    this.filteredArgs[i10] = null;
                }
            }
            this.filter = filter;
        }

        public FilteredArguments(Object[] objArr) {
            this.filter = null;
            this.arguments = objArr;
            this.unpackedArgs = new Object[objArr.length];
            this.filteredArgs = new Object[objArr.length];
            this.isLocaleSpecific = new boolean[objArr.length];
            this.argFilterType = new int[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                Object obj = objArr[i10];
                if (obj instanceof TrustedInput) {
                    this.unpackedArgs[i10] = ((TrustedInput) obj).getInput();
                    this.argFilterType[i10] = 0;
                } else if (obj instanceof UntrustedInput) {
                    this.unpackedArgs[i10] = ((UntrustedInput) obj).getInput();
                    if (objArr[i10] instanceof UntrustedUrlInput) {
                        this.argFilterType[i10] = 2;
                    } else {
                        this.argFilterType[i10] = 1;
                    }
                } else {
                    this.unpackedArgs[i10] = obj;
                    this.argFilterType[i10] = 1;
                }
                this.isLocaleSpecific[i10] = this.unpackedArgs[i10] instanceof LocaleString;
            }
        }
    }

    public LocalizedMessage(String str, String str2) throws NullPointerException {
        this.encoding = "ISO-8859-1";
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null || str2 == null) {
            throw null;
        }
        this.f20110id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments();
    }

    public String addExtraArgs(String str, Locale locale) {
        if (this.extraArgs == null) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        Object[] filteredArgs = this.extraArgs.getFilteredArgs(locale);
        for (Object obj : filteredArgs) {
            stringBuffer.append(obj);
        }
        return stringBuffer.toString();
    }

    public String formatWithTimeZone(String str, Object[] objArr, Locale locale, TimeZone timeZone) {
        MessageFormat messageFormat = new MessageFormat(" ");
        messageFormat.setLocale(locale);
        messageFormat.applyPattern(str);
        if (!timeZone.equals(TimeZone.getDefault())) {
            Format[] formats = messageFormat.getFormats();
            for (int i10 = 0; i10 < formats.length; i10++) {
                Format format = formats[i10];
                if (format instanceof DateFormat) {
                    DateFormat dateFormat = (DateFormat) format;
                    dateFormat.setTimeZone(timeZone);
                    messageFormat.setFormat(i10, dateFormat);
                }
            }
        }
        return messageFormat.format(objArr);
    }

    public Object[] getArguments() {
        return this.arguments.getArguments();
    }

    public ClassLoader getClassLoader() {
        return this.loader;
    }

    public String getEntry(String str, Locale locale, TimeZone timeZone) throws MissingEntryException {
        String strA = this.f20110id;
        if (str != null) {
            strA = b.a(strA, ".", str);
        }
        String str2 = strA;
        try {
            ClassLoader classLoader = this.loader;
            String string = (classLoader == null ? ResourceBundle.getBundle(this.resource, locale) : ResourceBundle.getBundle(this.resource, locale, classLoader)).getString(str2);
            if (!this.encoding.equals("ISO-8859-1")) {
                string = new String(string.getBytes("ISO-8859-1"), this.encoding);
            }
            if (!this.arguments.isEmpty()) {
                string = formatWithTimeZone(string, this.arguments.getFilteredArgs(locale), locale, timeZone);
            }
            return addExtraArgs(string, locale);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        } catch (MissingResourceException unused) {
            String strA2 = o.a(e.a("Can't find entry ", str2, " in resource file "), this.resource, ".");
            String str3 = this.resource;
            ClassLoader classLoader2 = this.loader;
            if (classLoader2 == null) {
                classLoader2 = getClassLoader();
            }
            throw new MissingEntryException(strA2, str3, str2, locale, classLoader2);
        }
    }

    public Object[] getExtraArgs() {
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments == null) {
            return null;
        }
        return filteredArguments.getArguments();
    }

    public Filter getFilter() {
        return this.filter;
    }

    public String getId() {
        return this.f20110id;
    }

    public String getResource() {
        return this.resource;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.loader = classLoader;
    }

    public void setExtraArgument(Object obj) {
        setExtraArguments(new Object[]{obj});
    }

    public void setExtraArguments(Object[] objArr) {
        if (objArr == null) {
            this.extraArgs = null;
            return;
        }
        FilteredArguments filteredArguments = new FilteredArguments(objArr);
        this.extraArgs = filteredArguments;
        filteredArguments.setFilter(this.filter);
    }

    public void setFilter(Filter filter) {
        this.arguments.setFilter(filter);
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments != null) {
            filteredArguments.setFilter(filter);
        }
        this.filter = filter;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Resource: \"");
        stringBuffer.append(this.resource);
        stringBuffer.append("\" Id: \"");
        stringBuffer.append(this.f20110id);
        stringBuffer.append("\" Arguments: ");
        stringBuffer.append(this.arguments.getArguments().length);
        stringBuffer.append(" normal");
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments != null && filteredArguments.getArguments().length > 0) {
            stringBuffer.append(", ");
            stringBuffer.append(this.extraArgs.getArguments().length);
            stringBuffer.append(" extra");
        }
        stringBuffer.append(" Encoding: ");
        stringBuffer.append(this.encoding);
        stringBuffer.append(" ClassLoader: ");
        stringBuffer.append(this.loader);
        return stringBuffer.toString();
    }

    public LocalizedMessage(String str, String str2, String str3) throws UnsupportedEncodingException, NullPointerException {
        this.encoding = "ISO-8859-1";
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null || str2 == null) {
            throw null;
        }
        this.f20110id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments();
        if (!Charset.isSupported(str3)) {
            throw new UnsupportedEncodingException(n.d("The encoding \"", str3, "\" is not supported."));
        }
        this.encoding = str3;
    }

    public LocalizedMessage(String str, String str2, String str3, Object[] objArr) throws UnsupportedEncodingException, NullPointerException {
        this.encoding = "ISO-8859-1";
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null || str2 == null || objArr == null) {
            throw null;
        }
        this.f20110id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments(objArr);
        if (!Charset.isSupported(str3)) {
            throw new UnsupportedEncodingException(n.d("The encoding \"", str3, "\" is not supported."));
        }
        this.encoding = str3;
    }

    public LocalizedMessage(String str, String str2, Object[] objArr) throws NullPointerException {
        this.encoding = "ISO-8859-1";
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null || str2 == null || objArr == null) {
            throw null;
        }
        this.f20110id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments(objArr);
    }
}
