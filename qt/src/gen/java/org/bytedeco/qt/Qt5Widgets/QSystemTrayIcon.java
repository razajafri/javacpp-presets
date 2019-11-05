// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qsystemtrayicon.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QSystemTrayIcon extends QObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QSystemTrayIcon(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QSystemTrayIcon(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QSystemTrayIcon position(long position) {
        return (QSystemTrayIcon)super.position(position);
    }

    public QSystemTrayIcon(QObject parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QObject parent/*=nullptr*/);
    public QSystemTrayIcon() { super((Pointer)null); allocate(); }
    private native void allocate();
    public QSystemTrayIcon(@Const @ByRef QIcon icon, QObject parent/*=nullptr*/) { super((Pointer)null); allocate(icon, parent); }
    private native void allocate(@Const @ByRef QIcon icon, QObject parent/*=nullptr*/);
    public QSystemTrayIcon(@Const @ByRef QIcon icon) { super((Pointer)null); allocate(icon); }
    private native void allocate(@Const @ByRef QIcon icon);

    public enum ActivationReason {
        Unknown(0),
        Context(1),
        DoubleClick(2),
        Trigger(3),
        MiddleClick(4);

        public final int value;
        private ActivationReason(int v) { this.value = v; }
        private ActivationReason(ActivationReason e) { this.value = e.value; }
        public ActivationReason intern() { for (ActivationReason e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

// #if QT_CONFIG(menu)
    public native void setContextMenu(QMenu menu);
    public native QMenu contextMenu();
// #endif

    public native @ByVal QIcon icon();
    public native void setIcon(@Const @ByRef QIcon icon);

    public native @ByVal QString toolTip();
    public native void setToolTip(@Const @ByRef QString tip);

    public static native @Cast("bool") boolean isSystemTrayAvailable();
    public static native @Cast("bool") boolean supportsMessages();

    public enum MessageIcon { NoIcon(0), Information(1), Warning(2), Critical(3);

        public final int value;
        private MessageIcon(int v) { this.value = v; }
        private MessageIcon(MessageIcon e) { this.value = e.value; }
        public MessageIcon intern() { for (MessageIcon e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
    public native @Cast("bool") boolean isVisible();
    public native void setVisible(@Cast("bool") boolean visible);
    public native void show();
    public native void hide();
    public native void showMessage(@Const @ByRef QString title, @Const @ByRef QString msg, @Const @ByRef QIcon icon, int msecs/*=10000*/);
    public native void showMessage(@Const @ByRef QString title, @Const @ByRef QString msg, @Const @ByRef QIcon icon);
    public native void showMessage(@Const @ByRef QString title, @Const @ByRef QString msg,
                         MessageIcon icon/*=QSystemTrayIcon::Information*/, int msecs/*=10000*/);
    public native void showMessage(@Const @ByRef QString title, @Const @ByRef QString msg);
}
