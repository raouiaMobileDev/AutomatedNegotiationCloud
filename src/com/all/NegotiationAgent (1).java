ecated</short>
          
        </locale>
      </schema>

      <schema>
        <key>/schemas/apps/panel/global/screenshot_key</key>
        <applyto>/apps/panel/global/screenshot_key</applyto>
        <owner>panel</owner>
        <type>string</type>
        <default>Print</default>
        <gettext_domain>gnome-panel-2.0</gettext_domain>
        <locale name="C">
          <short>Deprecated</short>
          
        </locale>
      </schema>

      <schema>
        <key>/schemas/apps/panel/global/window_screenshot_key</key>
        <applyto>/apps/panel/global/window_screenshot_key</applyto>
        <owner>panel</owner>
        <type>string</type>
        <default>&lt;Alt&gt;Print</default>
        <gettext_domain>gnome-panel-2.0</gettext_domain>
        <locale name="C">
          <short>Deprecated</short>
          
        </locale>
      </schema>

      <schema>
        <key>/schemas/apps/panel/global/drawer_autoclose</key>
        <applyto>/apps/panel/global/drawer_autoclose</applyto>
        <owner>panel</owner>
        <type>bool</type>
        <default>true</default>
        <gettext_domain>gnome-panel-2.0</gettext_domain>
        <locale name="C">
          <short>Autoclose drawer</short>
          <long>If true, a drawer will automatically be closed when the user clicks a launcher in it.</long>
        </locale>
      </schema>

      <schema>
        <key>/schemas/apps/panel/global/confirm_panel_remove</key>
        <applyto>/apps/panel/global/confirm_panel_remove</applyto>
        <owner>panel</owner>
        <type>bool</type>
        <default>true</default>
        <gettext_domain>gnome-panel-2.0</gettext_domain>
        <locale name="C">
          <short>Confirm panel removal</short>
          <long>If true, a dialog is shown asking for confirmation if the user wants to remove a panel.</long>
        </locale>
      </schema>

      <schema>
        <key>/schemas/apps/panel/global/highlight_launchers_on_mouseover</key>
        <applyto>/apps/panel/global/highlight_launchers_on_mouseover</applyto>
        <owner>panel</owner>
        <type>bool</type>
        <default>true</default>
        <gettext_domain>gnome-panel-2.0</gettext_domain>
        <locale name="C">
          <short>Highlight launchers on mouseover</short>
          <long>If true, a launcher is highlighted when the user moves the pointer over it.</long>
        </locale>
      </schema>

      <schema>
        <key>/schemas/apps/panel/global/locked_down</key>
        <applyto>/apps/panel/global/locked_down</applyto>
        <owner>panel</owner>
        <type>bool</type>
        <default>false</default>
        <gettext_domain>gnome-panel-2.0</gettext_domain>
        <locale name="C">
          <short>Complete panel lockdown</short>
          <long>If true, the panel will not allow any changes to the configuration of the panel. Individual applets may need to be locked down separately however. The panel must be restarted for this to take effect.</long>
        </locale>
      </schema>

      <schema>
        <key>/schemas/apps/panel/global/disabled_applets</key>
        <applyto>/apps/panel/global/disabled_applets</applyto>
        <owner>panel</owner>
        <type>list</type>
	<list_type>string</list_type>
        <default>[]</default>
        <gettext_domain>gnome-panel-2.0</gettext_domain>
        <locale name="C">
          <short>Applet IIDs to disable from loading</short>
          <long>A list of applet IIDs that the panel will ignore. This way you can disable certain applets from loading or showing up in the menu. For example to disable the mini-commander applet add 'OAFIID:GNOME_MiniCommanderApplet' to this list. The panel must be restarted for this to take effect.</long>
        </locale>
      </schema>

      <schema>
        <key>/schemas/apps/panel/global/disable_lock_screen</key>
        <applyto>/apps/panel/global/disable_lock_screen</applyto>
        <owner>panel</owner>
        <type>bool</type>
        <default>false</default>
        <gettext_domain>gnome-panel-2.0</gettext_domain>
        <locale name="C">
          <short>Deprecated</short>
	  <long>This key is deprecated as it cannot be used to implement proper lockdown. The /desktop/gnome/lockdown/disable_lock_screen key should be used instead.</long>
        </locale>
      </schema>

      <schema>
        <key>/schemas/apps/panel/global/disable_log_out</key>
        <applyto>/apps/panel/global/disable_log_out</applyto>
        <owner>panel</owner>
        <type>bool</type>
        <default>false</default>
        <gettext_domain>gnome-panel-2.0</gettext_domain>
        <locale name="C">
          <short>Disable Logging Out</short>
          <long>If true, the panel will not allow a user to log out, by removing access to the log out menu entries.</long>
        </locale>
      </schema>

      <schema>
        <key>/schemas/apps/panel/global/disable_force_quit</key>
        <applyto>/apps/panel/global/disable_force_quit</applyto>
        <owner>panel</owner>
        <type>bool</type>
        <default>false</default>
        <gettext_domain>gnome-panel-2.0</gettext_domain>
        <locale name="C">
          <short>Disable Force Quit</short>
          <long>If true, the panel will not allow a user to force an application to quit by removing access to the force quit button.</long>
        </locale>
      </schema>

  </schemalist>
  
</gconfschemafile>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         