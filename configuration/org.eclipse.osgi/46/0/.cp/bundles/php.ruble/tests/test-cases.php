<?php

/**
 * Code snippets designed to stress the PHP grammar
 *
 * This is admittedly a mess, and many of the lines aren't actually valid. I'm just trying to test
 * that certain things happen in a more sane fashion than others. This will definitely be cleaned up
 * in the future.
 */

//
// Namespaces & Classes
//
namespace blah;
namespace one_two;
namespace one_two\three_four;
namespace blah\one\two;

// Respond sanely here, despite the parse error
namespace noend

// Handle blocks
namespace block {

}

namespace block
{

}

namespace 123; // Invalid namespace

use 123\123; // Invalid
use foo as 123; // Invalid
use foo\bar; use bar\foo;

// Invalid (missing semicolon)
use \foo\bar

use \foo\bar\baz;

use \foo\bar,
    \bar\foo,
    blah_foo\foo,
    one\more_time\forKicks;

use \foo\bar as blah, // test
    // Test
    \bar\foo as asdf, // test
    /* Test */
    blah_foo\foo as fdsa,
    one\more_time\forKicks as lkajsdf; // test
    

namespace one\more 
{
    use \foo\bar;
}

class Foo 
{
    public $bar;
    protected $_blah;
    private $_test;
    public static $bar;
    protected static $_blah;
    private static $_test;
    static public $bar;
    static protected $_blah;
    static private $_test;
    static $bar;
    static $_blah;
    static $_test;
}

class Foo extends Bar
{
}

class Foo extends foo\Bar
{
}

class Foo implements Bar
{
}

class Foo implements foo\Bar
{
}

class Foo extends foo\Bar implements foo\Bar
{
    public static $blah;
    
    public function blah()
    {
        shouldNotShowInSymbols();
    }

    public static function blah()
    {
        
    }

    static protected function blah()
    {
        
    }
}

abstract class Foo;
abstract class Foo {}

abstract class Foo extends Bar;
abstract class Foo extends Bar {}

abstract class Foo extends foo\Bar;
abstract class Foo extends foo\Bar {}

interface Foo
{
}

interface Foo extends Bar
{
}

interface Foo extends foo\blah\Bar 
{
}

// =============
// = Functions =
// =============
function test()
function test($foo, $foo = 1, &$foo = array(), &$foo = array(1, "2", "3", 4))
function test(array $foo = array(1, "2", "3", 4), array &$foo = array(), array $foo = null, array $foo = invalid)
function test(array $foo)
function test(stdClass $foo)
function test(foo\bar\blah $foo)
function test(stdClass $foo = null)
function &test(stdClass $foo = invalid)

$blah = function (stdClass $foo = invalid, array $blah = array()) {
    
};

$blah = function (stdClass $foo = invalid, array $blah) use (&$foo, $bar) {
    $test = 'test';
};

$blah();
$blah(1, 2, 3);
blah(1, 2, 3);

$blah = new Foo();
$blah = new Foo;
$blah = new \blah\Foo();
$blah = new blah\Foo();
$blah = new $foo();
$blah = new $foo;
$blah = new blah\$Foo();

Foo::bar(new test());
Foo::bar(new test);
blah\Foo::bar(new blah\test());

// ========================
// = String interpolation =
// ========================
'$foo'
'\''
'\\'
"1\1111"
"1\x111"
"$foo"
"$foo[bar]"
"$foo[0]"
"$foo[$bar]"
"$foo->bar"
"$foo->$foo"
"{$foo->$bar}"
"{$foo->bar}"
"{$foo->bar[0]->baz}"
"{$foo->bar(12, $foo)}"
"{$foo(12, $foo)}"

$foo = $foo->{'foo' . 'bar'};

// Heredoc
$foo = <<<BLAH
Blah blah $foo blah {$foo->bar} 
Stuff goes here
BLAH;

// Nowdoc (no interpolation should occur here)
$foo = <<<'BLAH'
Blah blah $foo blah {$foo->bar} 
Stuff goes here
BLAH;

namespace foo\bar;

E_ERROR
E_DEPRECATED
E_NOTICE
E_COMPILE_ERROR
E_PARSE
E_USER_DEPRECATED
__FILE__
__DIR__
__NAMESPACE__

echo E_ERROR;
echo \E_ERROR;
echo namespace\E_ERROR;

array_map();
array_map($test, 'foo', MY_CONST);
\array_map();
blah\array_map();
namespace\array_map($test, 'foo');

// `namespace` should not be highlighted as a namespace component but rather as an operator like
// `self` or `static`
\foo\blah();
namespace\foo();
$blah = new foo();
$blah = new foo\bar();
$blah = new foo\bar\();
$blah = new namespace\Foo();
$blah = new self\Foo();
$foo->bar();

// `self` and `static` should be storage.type.php
self::foo();
static::foo();
Blah::foo();
\foo\Blah::foo();

$foo = self::BAR;
$foo = static::BAR;
$foo = self::$bar;
$foo = static::$bar;

static::${$test} = 'test';
Blah::${$test} = 'test';
\foo\Blah::${$test} = 'test';
${$test} = 'test';

new self(); // `self` should highlight differently
new static(); // `static` should highlight differently
new Blah();

goto foo;

foo:

goto blah;

blah: {
    
}


// =======
// = SQL =
// =======
'SELECT * from foo WHERE bar = \'foo \\ ' . $foo . 'sadas';
'SELECT * from foo WHERE bar = "foo" asdas' . $foo . '" asdasd';


"SELECT * from foo WHERE bar = 'asd $foo $foo->bar {$foo->bar[12]} asda'  'unclosed string";
"SELECT * from foo WHERE bar = \"dsa$foo\" \"unclosed string"
'SELECT * from foo WHERE bar = "unclosed string';

'SELECT * from foo WHERE bar = "foo \" ' . $foo . ' bar" AND foo = 1';

// Comments

'SELECT * FROM # foo bar \' asdassdsaas';
'SELECT * FROM -- foo bar \' asdassdsaas';
"SELECT * FROM # foo bar \" asdassdsaas";
"SELECT * FROM -- foo bar \" asdassdsaas";


$foo = new Bar();

$mode = PDO::FETCH_ASSOC;
$mode = \PDO::FETCH_ASSOC;
$mode = namespace\PDO::FETCH_ASSOC;
$blah = \stuff\PDO::FETCH_ASSOC;
$more = stuff\PDO::FETCH_ASSOC;
$blah = \stuff\more\PDO::FETCH_ASSOC;
$more = stuff\more\PDO::FETCH_ASSOC;
$blah = $blah::FETCH_ASSOC;
$blah = \blah\$blah::FETCH_ASSOC;
$blah = \blah\$blah\foo\$blah::FETCH_ASSOC;

$mode = PDO::$prop;
$mode = \PDO::$prop;
$mode = namespace\PDO::$prop;
$blah = \stuff\PDO::$prop;
$more = stuff\PDO::$prop;
$blah = \stuff\more\PDO::$prop;
$more = stuff\more\PDO::$prop;

$mode = PDO::staticMethod();
$mode = \PDO::staticMethod();
$mode = namespace\PDO::staticMethod();
$blah = \stuff\PDO::staticMethod();
$more = stuff\PDO::staticMethod();
$blah = \stuff\more\PDO::staticMethod();
$more = stuff\more\PDO::staticMethod();

$mode = funcCall();
$mode = \funcCall();
$mode = namespace\funcCall();
$blah = \stuff\funcCall();
$more = stuff\funcCall();
$blah = \stuff\more\funcCall();
$more = stuff\more\funcCall();

$blah = $foo->test;
$blah = foo->test;
$blah = ${'foo'}->test;

// When type hinting:
class Test {
    public function __construct(\My\Namespace\MyClass $myClass) {
        // ..
    }
}
class Test {
    public function __construct(namespace\MyClass $myClass) {
        // ..
    }
}

// Assuming this is in the same area as type hinting, in catch blocks:

try {
    // ..
} catch (PDOException $e) {
    // ..
}
try {
    // ..
} catch (asdf\PDOException $e) {
    // ..
}
try {
    // ..
} catch (\asdf\foo\PDOException $e) {
    // ..
}
try {
    // ..
} catch (namespace\PDOException $e) {
    // ..
}

// Also while technically not an issue, the namespace keyword isn't actually interpreted as a library keyword and rather as if it was a user defined namespace. (http://www.php.net/manual/en/language.namespaces.nsconstants.php)

$keyword = new \MyClass();
$keyword = new namesace\MyClass();
$blah = new namespace\MyClass();
$blah = new \namespace\MyClass();
$blah = new foo\namespace\MyClass();

$blah = new blah();
$blah = new blah\blah();
$blah = new blah\$blah\$blah\blah();

if ($test == 1) {
    
} else if (123 === $foo) {
    
} elseif (CONST) {
    
} else {
    
}

if ($blah instanceof MyClass) {
    
}

if ($blah instanceof foo\MyClass) {
    
}

if ($blah instanceof namespace\foo\MyClass) {
    
}

if ($blah instanceof $b) {
    
}

foo(&$blah); // Ampersand should be invalid.deprecated.call-time-pass-by-reference.php
foo(&$blah, array(), &$blah); // Ampersand should be invalid.deprecated.call-time-pass-by-reference.php
foo(array($blah, &$foo)); // Ampersand should be storage.modifier.reference.php

$blah =<<<HTML
<html>
</head>
HTML;

$blah =<<<CSS
.test {
    width: 120px;
}
CSS;

$blah =<<<JSON
{ "blah": { "foo": 123, "bar": 321 } }
JSON;

require 'foo';
require_once 'blah';
include 'lkajsdf';

$foo = array(1, 2, 3);
$foo = array(
    // One
    1,
    // Two
    2,
);

// Built-in classes

throw new Exception('Bad thing happened!');
throw new ErrorException('Bad thing happened!');

$x = new SplDoublyLinkedList();
$x = new SplFileInfo();
$x = new SplTempFileObject();
$x = new RecursiveDirectoryIterator();
$x = new GlobIterator();
$x = new stdClass;

// SPL Exceptions
throw new BadFunctionCallException();
throw new BadMethodCallException();
throw new DomainException();
throw new InvalidArgumentException();
throw new LengthException();
throw new LogicException();
throw new OutOfBoundsException();
throw new OutOfRangeException();
throw new OverflowException();
throw new RangeException();
throw new RuntimeException();
throw new UnderflowException();
throw new UnexpectedValueException();

// Built-in functions

call_user_method();
call_user_method_array();
define_syslog_variables();
dl();
ereg();
ereg_replace();
eregi();
eregi_replace();
set_magic_quotes_runtime();
session_register();
session_unregister();
session_is_registered();
set_socket_blocking();
split();
spliti();
sql_regcase();
mysql_db_query();
mysql_escape_string();


?>