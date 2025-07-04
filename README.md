Mobile App Development 

project HelloToast Enhancements

project Goal

This project will get you comfortable with fundamental Android UI development, focusing on modifying existing layouts and implementing interactive button functionalities. You'll enhance a simple "HelloToast" application by adding new UI elements and dynamic behavior.
![Screenshot (46)](https://github.com/user-attachments/assets/6f6c1292-9081-4140-9894-4ced1ce51847)

Tasks Completed
1. Layout Modifications in activity_main.xml
• Button Alignment: Adjust the layout so that the 'Toast' and 'Count' Button elements are aligned along the left side of the show_count TextView (the one that initially displays "0").
• Add 'Zero' Button: Introduce a third Button named 'Zero'. This button should appear between the 'Toast' and 'Count' Button elements in the layout.
• Vertical Distribution: Ensure the three Button elements ('Toast', 'Zero', 'Count') are distributed vertically between the top and bottom edges of the show_count TextView.
2. Implement 'Zero' Button Functionality
• Initial State: Set the 'Zero' Button to initially have a gray background when the app starts.
• Reset Count: When the 'Zero' Button is clicked, it must change the value displayed in the show_count TextView to 0.
3. Dynamic Button Colors
• 'Count' Button Background: Update the click handler for the 'Count' Button (showCount() method). When it's clicked, its own background color must change dynamically. If the new count is an odd number, set it to one color (e.g., green). If the new count is an even number, set it to another color (e.g., blue).
• Activate 'Zero' Button: Still within the 'Count' Button's click handler, after a count increment, change the background color for the 'Zero' Button to something other than gray
2
(e.g., orange). This indicates that the 'Zero' button is now "active" because the count is no longer zero.
• Reset 'Zero' Button Color: Update the click handler for the 'Zero' Button (showZero() method). When it's clicked and the count is reset to 0, its background color must reset back to gray.
4. Responsive Design
• Orientation Support: Ensure your layout design is responsive and looks good and functions correctly in both portrait and landscape orientations. Test your app thoroughly by rotating your device or emulator.
Important Tips & Best Practices
• Layouts: Focus on using ConstraintLayout for flexible and responsive designs. You can also explore LinearLayout for simpler linear arrangements.
• Button Click Handlers: You'll typically assign an onClick method in your XML layout, which corresponds to a public method in your MainActivity (e.g., showToast(View view)).
• TextViews: To get a reference to your TextView and update its text, use findViewById() and setText().
• Background Colors: To change button background colors dynamically, you can use button.setBackgroundColor(ContextCompat.getColor(this, R.color.your_color_name)). Define your colors in res/values/colors.xml.
• Responsive Design: Consider creating different layout files for different orientations (e.g., res/layout/activity_main.xml for portrait and res/layout-land/activity_main.xml for landscape).
