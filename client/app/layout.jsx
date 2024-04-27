import { Poppins } from "next/font/google";
import "./globals.css";


const poppins = Poppins({
  subsets: ['latin'],
  weight: ['400', '500', '600', '700'],
})


export const metadata = {
  title: 'Evently',
  description: 'Evently is a platform for event management.',
  icons: {
    icon: '/assets/images/logo.svg'
  }
};

export default function RootLayout({ children }) {
  return (
    <html lang="en">
      <body className={poppins.className}>{children}</body>
    </html>
  );
}
